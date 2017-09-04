public class Vehiculo
{
    private String placas;
    private String msg;
    public Vehiculo()
    {
        String placas = "";
        String msg = "no existe placas";
    }
    
    public void creaVehiculo()
    {
        Vehiculo vehiculo = new Vehiculo();
    }
    
    public String ingresaVehiculo(String vehIn)
    {
        placas = vehIn;
        return placas;
    }
    
    public String saleVehiculo(String vehOut)
    {
        if(vehOut != placas)
        {
            return msg;
        }else
            vehOut = null;
            return vehOut;
    }
}