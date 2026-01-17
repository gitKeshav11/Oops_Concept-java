package OOps_Concept;

class G{
    int a; String b; double c;

    private G()
    {
        a = 202001 ; b = " Keshav_Upadhyay.."; c=39.06;
        System.out.println(a+" "+b+" "+c);
    }

    public static void main(String[] args){
        G obj=new G();

    }

}
//
//public class Private_Const {
//      G obj=new G();               अलग क्लास बनाकर कॉल नहीं कर सकते कियूकी Private क्लास  हैं
//}
