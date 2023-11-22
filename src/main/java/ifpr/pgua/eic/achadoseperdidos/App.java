package ifpr.pgua.eic.achadoseperdidos;

import ifpr.pgua.eic.achadoseperdidos.controllers.Cadastro;
import ifpr.pgua.eic.achadoseperdidos.controllers.Principal;
import ifpr.pgua.eic.achadoseperdidos.models.ObjetoPerdido;

/**
 * JavaFX App
 */
public class App extends BaseAppNavigator{

    private ObjetoPerdido gerenciador;

    /**
     * @throws Exception
     */
    @Override
    public void init() throws Exception {
        super.init();

        gerenciador = new ObjetoPerdido(0, null);
    }

    @Override
    public String getHome() {
        return "PRINCIPAL";
    }


    @Override
    public String getAppTitle() {
        return "Achados e Perdidos";
    }

    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryFXML(App.class, "principal.fxml", o->new Principal()));
       
       
    }

    public static void popScreen() {
    } 
}
