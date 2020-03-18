
public class Tienda
{   //atributos
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;
    private Producto producto4;
    
    private Double dineroCaja;
    
    //constructor    
    public Tienda(){
        producto1 = new Producto("Carpeta",1,20,10,2000.0);
        producto2 = new Producto("Pan",2,20,10,500.0);
        producto3 = new Producto("Acetaminofen",3,50,20,1500.0);
        producto4 = new Producto("Lapicero",1,30,20,1000.0);
        
        dineroCaja = 0.0;
    }
    
    //regresar info de productos
    public Producto getProducto1(){return producto1;}
    
    public Producto getProducto2(){return producto2;}
    
    public Producto getProducto3(){return producto3;}
    
    public Producto getProducto4(){return producto4;}
    
    //mostrar dinero en caja
    public Double getDineroEnCaja(){return dineroCaja;}
    
    //promedio ventas
    public Double getPromedioVentas(){
        Double promedio = 0.0;
        
        Integer totalUnidadesVendidas = producto1.getUnidadesVendidas() + producto2.getUnidadesVendidas() + producto3.getUnidadesVendidas() + producto4.getUnidadesVendidas();
        
        promedio = dineroCaja/totalUnidadesVendidas;
        
        return promedio;
    }
    
    //producto mas vendido
    public Producto getProductoMasVendido()
    {
        int venta1 = producto1.getUnidadesVendidas();
        int venta2 = producto2.getUnidadesVendidas();
        int venta3 = producto3.getUnidadesVendidas();
        int venta4 = producto4.getUnidadesVendidas();

        Producto masVendido = null;
        int mayorCantidad = 0;

        if(venta1 > mayorCantidad)
        {
            masVendido = producto1;
            mayorCantidad = venta1;
        }
        if(venta2 > mayorCantidad)
        {
            masVendido = producto2;
            mayorCantidad = venta2;
        }
        if(venta3 > mayorCantidad)
        {
            masVendido = producto3;
            mayorCantidad = venta2;
        }
        if(venta4 > mayorCantidad)
        {
            masVendido = producto4;
        }

        return masVendido;
    }

    //producto menos vendido
    public Producto getProductoMenosVendido()
    {
        int venta1 = producto1.getUnidadesVendidas();
        int venta2 = producto2.getUnidadesVendidas();
        int venta3 = producto3.getUnidadesVendidas();
        int venta4 = producto4.getUnidadesVendidas();

        Producto menosVendido = null;

        if(venta1 > 0 || venta2 > 0 || venta3 > 0 || venta4 > 0)
        {
            if(venta1 <= venta2 && venta1 <= venta3 && venta1 <= venta4)
            {
                menosVendido = producto1;
            }
            else if(venta2 <= venta1 && venta2 <= venta3 && venta2 <= venta4)
            {
                menosVendido = producto2;
            }
            else if(venta3 <= venta2 && venta3 <= venta1 && venta3 <= venta4)
            {
                menosVendido = producto3;
            }
            else
            {
                menosVendido = producto4;
            }
        }

        return menosVendido;
    }
    
    public Producto getProducto(String pNombre)
    {
        Producto buscado = null;

        if(producto1.getNombre().equals(pNombre))
        {
            buscado = producto1;
        }
        else if(producto2.getNombre().equals(pNombre))
        {
            buscado = producto2;
        }
        else if(producto3.getNombre().equals(pNombre))
        {
            buscado = producto3;
        }
        else if(producto4.getNombre().equals(pNombre))
        {
            buscado = producto4;
        }
        
        return buscado;
    }

    //vender producto
    public int venderProducto( String nombreProducto, int pCantidad )
    {
        int cantidadVendida = 0;
        Producto producto = getProducto(nombreProducto);
        cantidadVendida = producto.venderProducto(pCantidad);
        dineroCaja = dineroCaja + (cantidadVendida * producto.calcularPrecioFinal());

        return cantidadVendida;
    }
    

}
