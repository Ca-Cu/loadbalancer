package edu.escuelaing.arep;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;


import static spark.Spark.*;

public class App {
    private static String[] servers = {"http://ec2-35-174-167-194.compute-1.amazonaws.com:4567","http://ec2-18-234-191-169.compute-1.amazonaws.com:4567"};
    private static int nServer=0;

    public static void main(String args[]){
        port(getPort());

        after("*", (req,res) ->{
            res.header("Access-Control-Allow-Headers", "Content-Type,Authorization,X-Requested-With,Content-Length,Accept,Origin");
            res.header("Access-Control-Allow-Credentials", "true");

            res.header("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
            res.header("Access-Control-Allow-Origin", "*");
        });

        get("/getCancerDeCuelloUterinoBYIdPaciente", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getCancerDeCuelloUterinoBYIdPaciente?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/getEspecialidadById", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getEspecialidadById?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/getEspecialidades", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getEspecialidades").asString();
            return apiresponse.getBody();
        });
        get("/getHistoriaSexualByIdPaciente", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getEspecialidades?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/getMetodosPlanificacion", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getMetodosPlanificacion").asString();
            return apiresponse.getBody();
        });
        get("/getMetodosPlanificacionByid", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getMetodosPlanificacionByid?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/getMetodosTamizacion", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getMetodosTamizacion").asString();
            return apiresponse.getBody();
        });
        get("/getMetodoTamizacionByid", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getMetodoTamizacionByid?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/getPatologias", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getPatologias").asString();
            return apiresponse.getBody();
        });
        get("/getPatologiaByid", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getPatologiaByid?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/getPatologiasPreinvasivasByIdPaciente", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getPatologiasPreinvasivasByIdPaciente?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/getPrevencionesSecundariasByIdPaciente", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getPrevencionesSecundariasByIdPaciente?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/getPrevencionPrimariaByIdPaciente", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getPrevencionPrimariaByIdPaciente?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/getTiposPurebasVPH", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getTiposPurebasVPH").asString();
            return apiresponse.getBody();
        });
        get("/getTipoPruebaVPHByid", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getTipoPruebaVPHByid?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/getTiposVacunasVPH", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getTiposVacunasVPH").asString();
            return apiresponse.getBody();
        });
        get("/getTipoVacunaVPHByid", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getTipoVacunaVPHByid?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/getUsuarioById", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getUsuarioById?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/getMedicoByTdocAndNdoc", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/getMedicoByTdocAndNdoc?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        get("/login", (req,res) ->{
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.get(servers[nServer]+"/login?"+req.queryString()).asString();
            return apiresponse.getBody();
        });
        post("/insertCancerDeCuelloUterino", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertCancerDeCuelloUterino").body(req.body()).asString();
            return null;
        });
        post("/insertEspecialidad", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertEspecialidad").body(req.body()).asString();
            return null;
        });
        post("/insertHistoriaSexual", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertHistoriaSexual").body(req.body()).asString();
            return null;
        });
        post("/insertMedico", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertMedico").body(req.body()).asString();
            return null;
        });
        post("/insertMetodoPlanificacion", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertMetodoPlanificacion").body(req.body()).asString();
            return null;
        });
        post("/insertMetodoTamizacion", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertMetodoTamizacion").body(req.body()).asString();
            return null;
        });
        post("/insertUsuario", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertUsuario").body(req.body()).asString();
            return null;
        });
        post("/insertPatologia", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertPatologia").body(req.body()).asString();
            return null;
        });
        post("/insertPatologiaPreinvasiva", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertPatologiaPreinvasiva").body(req.body()).asString();
            return null;
        });
        post("/insertPrevencionPrimaria", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertPrevencionPrimaria").body(req.body()).asString();
            return null;
        });
        post("/insertPrevencionSecundaria", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertPrevencionSecundaria").body(req.body()).asString();
            return null;
        });
        post("/insertTipoPruebaVPH", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertTipoPruebaVPH").body(req.body()).asString();
            return null;
        });
        post("/insertTipoVacunaVPH", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/insertTipoVacunaVPH").body(req.body()).asString();
            return null;
        });
        put("/putHistoriaSexual", (req, res) -> {
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.put(servers[nServer]+"/putHistoriaSexual").body(req.body()).asString();
            return null;
        });
        post("/putUsuario", (req, res) -> {
            System.out.println("aca");
            res.status(200);
            res.type("application/json");
            changeServer();
            HttpResponse<String> apiresponse=Unirest.post(servers[nServer]+"/putUsuario").body(req.body()).asString();
            return null;
        });
    }

    public static void changeServer(){
        nServer=(nServer + 1) % servers.length;
    }

    static int getPort(){
        if (System.getenv("PORT")!=null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
