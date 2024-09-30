import java.util.Scanner;
class Insurance {
    private String insuranceNum;
    private String insuranceName;
    private double AmountCovered;

    public String getInsuranceNum() {
        return insuranceNum;
    }

    public void setInsuranceNum(String insuranceNum) {
        this.insuranceNum = insuranceNum;
    }

    public String getInsuranceName() {
        return insuranceName;

    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getAmountCovered() {
        return AmountCovered;
    }

    public void setAmountCovered(double amountCovered) {
        this.AmountCovered = amountCovered;
    }
    }


    class MotorInsurance extends Insurance {
        private double idv;
        private float depPercent;

        public double getidv() {
            return idv;
        }

        public void setidv(double idv) {
            this.idv = idv;
        }

        public float getDepPercent() {
            return depPercent;
        }

        public void setDepPercent(float depPercent) {
            this.depPercent = depPercent;
        }

        public double Calcpremium() {
            // double idv, AmountCovered = 0.0;
            //float DepPercent = 0.0f;
            // double premium ;

            idv = getAmountCovered() - ((getAmountCovered() * depPercent) / 100);

            return idv * 0.03;


        }
    }

    class LifeInsurenace extends Insurance {
        private int Policyterm;
        private float benifitPercent;

        public int getPolicyterm() {
            return Policyterm;
        }

        public void setPolicyterm(int policyterm) {
            this.Policyterm = policyterm;
        }

        public float getBenifitPercent() {
            return benifitPercent;
        }

        public void setBenifitPercent(float benifitPercent) {
            this.benifitPercent = benifitPercent;
        }

        public double Calcpremium() {
            //double premium;
            //double AmountCovered = 0.0;
            // double BenifitPercent = 0.0f;
            // int Policyterm = 0;
            return getAmountCovered() - ((getAmountCovered() * benifitPercent) / 100) / Policyterm;

        }
    }


    public class InsuranceCalc {
        public static void main(String[] args) {
            //LifeInsurenace li = new LifeInsurenace();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Insurance Num");
            String insuranceNum = sc.nextLine();

            System.out.println("Enter Insurance Name");
            String insuranceName = sc.nextLine();

            System.out.println("Enter Insurance AmountCovered");
            double AmountCovered = sc.nextDouble();

            System.out.println("Enter Insurenceoption 1 or 2:");
            int op = sc.nextInt();

            Insurance in ;
            if (op == 1) {

                LifeInsurenace li = new LifeInsurenace();
                li.setInsuranceNum(insuranceNum);
                li.setInsuranceName(insuranceName);
                li.setAmountCovered(AmountCovered);
                System.out.println("Enter the policyterm:");
                int policyterm = sc.nextInt();

                li.setPolicyterm(policyterm);

                System.out.println("Enter the benifitPercent:");
                float benifitPercent = sc.nextFloat();

                li.setBenifitPercent(benifitPercent);
                //Insurance ins = new Insurance();
                // double calpre = li.Calcpremium();
                // System.out.println("Calculatedpremium is " + calpre);
                in = li;
            } else {
                MotorInsurance mi = new MotorInsurance();
                mi.setInsuranceNum(insuranceNum);
                mi.setInsuranceName(insuranceName);
                mi.setAmountCovered(AmountCovered);
                System.out.println("Enter the deppercentage:");
                float depPercent = sc.nextFloat();
                mi.setDepPercent(depPercent);
                //Insurance Insurance;

                in = mi;
            }
                double calcpre = AddPolicy(in,op);
                System.out.println("Calculatedpremium is " + calcpre);
                sc.close();

        }


            //  if(opt == 1){



        public static double AddPolicy(Insurance ins, int op) {
           // double premium = 0.0;
            if (op == 1) {

                return ((LifeInsurenace) ins).Calcpremium();
            } else {
                return ((MotorInsurance) ins).Calcpremium();
            }
        }
    }




