
package cake_app;


public class Cake
{
    // Initialize attributes for cake
    public  int layers;
    public int pieces;
    public String flavor = "";
    public String texture = "";
    public String icing = "";
    public String toppings = "";
    
    //Create a static method to track the number of cakes ordered or created
    private static int cakeCount = 0;
    
    public Cake(int l, int p)
    {
      layers = l;
      pieces = p;
      cakeCount++;
    }

    public int getLayers()
    {
        return layers;
    }

    public void setLayers(int layers)
    {
        this.layers = layers;
    }

    public int getPieces()
    {
        return pieces;
    }

    public void setPieces(int pieces)
    {
        this.pieces = pieces;
    }

    public String getFlavor()
    {
        return flavor;
    }

    public void setFlavor(String flavor)
    {
        this.flavor = flavor;
    }

    public String getTexture()
    {
        return texture;
    }

    public void setTexture(String texture)
    {
        this.texture = texture;
    }

    public String getIcing()
    {
        return icing;
    }

    public void setIcing(String icing)
    {
        this.icing = icing;
    }

    public String getToppings()
    {
        return toppings;
    }

    public void setToppings(String toppings)
    {
        this.toppings = toppings;
    }
    
    public void getCakeResults()
    {
        System.out.println("Hi can I get a " + this.flavor + " cake with " + this.icing +
              " frosting along with " + this.toppings + "\n");  
        
        System.out.println("I would like to be " + this.layers + " layer(s) high with a "
                + this.texture + " texture and to be cut in " + this.pieces +
                " pieces please." + "\n");
    }
    
    public static  int getCakeCount()
    {
        return cakeCount;
    }
    
}
