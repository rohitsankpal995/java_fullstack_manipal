package CodingQue;

public class StandardDeviation {


    public void getStandardDeviation(){

        int [] number = {10,12,23,16,23,21,16};
        int n =number.length;
        Double sum=0.0;
        double standardDev =0.0;
        Double mean=0.0;
        for (int num : number) {
            sum += num;
        }
        mean = sum /n;

        for (double num : number) {
            standardDev = standardDev+ Math.pow(num - mean, 2);
        }
        standardDev = Math.sqrt(standardDev/n);
        System.out.println("The standard deviation ::"+ standardDev);

    }

}
