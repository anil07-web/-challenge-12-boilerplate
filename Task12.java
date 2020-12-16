import java.util.Scanner;
 class Task12{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int count=0;
        String []stn=new String[100];
        int []rl=new int[100];
        float []math=new float[100];
        float []sci=new float[100];
        float []eng=new float[100];
        float []lang=new float[100];
        float []ss=new float[100];
        System.out.println("The number of students");
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("Enter the student name");
        stn[i]=obj.next();
        System.out.println("Enter the his/her Roll NUmber");
        rl[i]=obj.nextInt();
        System.out.println("Enter the his/her Marks in math");
        math[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Science");
        sci[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in English");
        eng[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Language");
        lang[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Social Studies");
        ss[i]=obj.nextFloat();
        } 
        System.out.println("Passed: ");
        System.out.println("Studentname");
        for(int j=0;j<n;j++){
        if(math[j]>=35&&sci[j]>=35&&eng[j]>=35&&lang[j]>=35&&ss[j]>=35){
         count=count+1;
        System.out.println(stn[j]+"   \t\t"+rl[j]+" (Roll No.)");
        }
        }
        System.out.println("The number of students who have cleared the examination "+count);
        System.out.println("------------------------------------------------------------------ ");
        count=0;
        System.out.println("Failed: ");
        System.out.println("Studentname");
        for(int j=0;j<n;j++){
        if(math[j]<35||sci[j]<35||eng[j]<35||lang[j]<35||ss[j]<35){
        count=count+1;
        System.out.println(stn[j]+"    \t\t"+rl[j]+" (Roll No.)");
        }
        }
        System.out.println("The number of students who needs to mandatorily repeat the examination "+count+"\n");
      }
    }
