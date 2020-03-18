public class Producto
{   //atributos                            
    private String nombre;
    private Integer tipo; // Tipo 1 Papeleria, Tipo 2 Supermercado, Tipo 3 Drogueria
    private Integer canAct;
    private Integer canMin;
    private Double precioBase;
    private Integer uTotalesVendidas;
    
    //constructor
    public Producto(String nombre, Integer tipo, Integer canAct, Integer canMin, Double precioBase){
        this.nombre = nombre;
        this.tipo = tipo;
        this.canAct = canAct;
        this.canMin = canMin;
        this.precioBase = precioBase;
        uTotalesVendidas = 0;
    }
    
    //getter and setter
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    
    public Integer getTipo(){return tipo;}
    public void setTipo(Integer tipo){this.tipo = tipo;}
    
    public Integer getCantidadActual(){return canAct;}
    public void setCantidadActual(Integer canAct){this.canAct = canAct;}
    
    public Integer getCantidadMinima(){return canMin;}
    public void setCantidadMinima(Integer canMin){this.canMin = canMin;}
    
    public Double getPrecioBase(){return precioBase;}
    public void setPrecioBase(Double precioBase){this.precioBase = precioBase;}
    
    public Integer getUnidadesVendidas(){return uTotalesVendidas;}
    
    //metodos
    public double calcularPrecioFinal( )
    {
        if(tipo==1) return precioBase + precioBase * 0.16;
        
        if(tipo==2) return precioBase + precioBase * 0.04;
        
        else return precioBase + precioBase * 0.12;    
    }
    
    public Integer venderProducto(Integer cantidadAVender){
        Integer uVendidas = 0;
        
        if(cantidadAVender>canAct){
            uVendidas = canAct;
            canAct = 0;
        }
        else{
            uVendidas = cantidadAVender;
            canAct = canAct - cantidadAVender;
        }
        
        uTotalesVendidas = uTotalesVendidas + uVendidas;
        
        return uVendidas;
    }
    
    public void abastecerProducto(Integer cantidad){
        canAct += cantidad;
    }
    
    
    
    
    
}