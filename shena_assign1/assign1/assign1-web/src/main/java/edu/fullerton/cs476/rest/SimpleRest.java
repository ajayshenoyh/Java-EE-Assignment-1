package edu.fullerton.cs476.rest;

import edu.fullerton.cs476.model.Coin;
import edu.fullerton.cs476.model.Operation;

import javax.ws.rs.*;
import java.awt.print.Book;
import java.util.Random;

/**
 * Created by faculty on 2/5/17.
 */
@Path("/simple")
public class SimpleRest {
    //curl http://localhost:8080/rest/simple/withFlipGet?flip=10
        @GET
        @Path("withFlipGet")
        @Produces({"application/json", "application/xml"})
        public Coin getFlip(@QueryParam("flip") int flip) {
            Coin my=new Coin();
            StringBuilder str = new StringBuilder();
            Random rand = new Random();

            for (int count = 0; count < flip; count++) {
                if (rand.nextInt(2) == 0)
                    str.append("T");
                else
                    str.append("H");
            }

            my.setno(flip);
            my.setflip(str.toString());
            return my;
        }

        @POST
        @Path("withFlipPost") // path: contextname/rest/simple/register
        @Consumes("application/x-www-form-urlencoded")
        public Coin registerFlip(@FormParam("flip") int flip) {
            Coin my=new Coin();
            StringBuilder str = new StringBuilder();
            Random rand = new Random();

            for (int count = 0; count < flip; count++) {
                if (rand.nextInt(2) == 0)
                    str.append("T");
                else
                    str.append("H");
            }

            my.setno(flip);
            my.setflip(str.toString());
            return my;
        }
        //curl http://localhost:8080/rest/simple/add?firstNumber=2&secondNumber=4
    @GET
    @Path("/add")
    @Produces({"application/json"})
    public Operation getAdd(
            @QueryParam("firstNumber") int firstNumber,
            @QueryParam("secondNumber") int secondNumber)
    {

        Operation op=new Operation("add",firstNumber,secondNumber);

        return  op;

    }


    @GET
    @Path("/subtract")
    @Produces({"application/json"})
    public Operation getSubtract(
            @QueryParam("firstNumber") int firstNumber,
            @QueryParam("secondNumber") int secondNumber)
    {
        Operation op=new Operation("subtract",firstNumber,secondNumber);

        return  op;

    }@GET
    @Path("/multiply")
    @Produces({"application/json"})
    public Operation getMul(
            @QueryParam("firstNumber") int firstNumber,
            @QueryParam("secondNumber") int secondNumber)
    {

        Operation op=new Operation("multiply",firstNumber,secondNumber);

        return  op;

    }@GET
    @Path("/divide")
    @Produces({"application/json"})
    public Operation getDiv(
            @QueryParam("firstNumber") int firstNumber,
            @QueryParam("secondNumber") int secondNumber)
    {

        Operation op=new Operation("divide",firstNumber,secondNumber);
        return  op;

    }

}


