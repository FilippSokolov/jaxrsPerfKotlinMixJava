import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path(value = "/helloAbstract")
public abstract class AbstractEndpoint {

    @GET
    public String getMessageForm() {
        return "<form action=\"helloOlga/sayHello\" method=\"GET\">\n" +
                " Name <input id=\"name\" name=\"name\"/> " +
                "<input type=\"submit\" />\n" +
                "  </form>";
    }

    @PATCH
    @Path("VVVVV/{name}" + "/some" + "/{value}")
    public String getTest133() {
        return "Hello3";
    }

    @GET
    @Path("sayHe23llo/{name}" + "/some" + "/{value}")
    public String getTest122() {
        return "Hello3";
    }

    @PUT
    @Path("sayHello/{name}" + "/some")
    abstract public String getTest12();

    @GET
    @Path(value = "helloValue")
    abstract public String getMessage1();

    @PUT
    @Path(value = "/ext4")
    @Produces("application/xml")
    public String say4() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello xml" + "</hello>";

    }

    @GET
    @Path(value = "/ext3")
    @Produces("text/plain")
    abstract public String say3();

    @GET
    @Path(value = "/ext9")
    @Produces(MediaType.TEXT_HTML)
    public String say9() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
    }

    @POST
    @Path(value = "/ext11")
    @Produces(MediaType.TEXT_XML)
    public abstract String say10();

    @Path("sayHello{name}")
    @GET
    public String doSayHello2(@PathParam("name") String name) {
        return "Hello there " + name;
    }


}
