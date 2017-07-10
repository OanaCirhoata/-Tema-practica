public class JavaApplication5
{
    public static void main(String[] args) {
        Connect control=new Connect();
        control.loaddata();
        control.afisare_xml("Connect.xml");
        control.afisare_txt("Connect.xml","Connect.txt");

    }
}
