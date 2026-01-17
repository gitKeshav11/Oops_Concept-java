package Oops.OOps_Concept;

class Q
{
    protected void show()
    {
        System.out.print("Learn Coding.........");
    }
}

class Package extends Q
{
    public static void main(String[] args){
        Package r=new Package();
        r.show();
    }
}

