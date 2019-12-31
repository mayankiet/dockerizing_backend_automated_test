package placePetOrder.response;

public class PlaceOrderResponseBody {

    private String petId;
    private String quantity;
    private String id;
    private String shipDate;
    private String complete;
    private String status;

    public String getPetId ()
    {
        return petId;
    }

    public void setPetId (String petId)
    {
        this.petId = petId;
    }

    public String getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (String quantity)
    {
        this.quantity = quantity;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getShipDate ()
    {
        return shipDate;
    }

    public void setShipDate (String shipDate)
    {
        this.shipDate = shipDate;
    }

    public String getComplete ()
    {
        return complete;
    }

    public void setComplete (String complete)
    {
        this.complete = complete;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }
}
