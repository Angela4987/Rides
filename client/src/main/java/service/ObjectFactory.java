
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AlertaAlreadyExistException_QNAME = new QName("http://businessLogic/", "AlertaAlreadyExistException");
    private final static QName _KotxeaAlreadyExistException_QNAME = new QName("http://businessLogic/", "KotxeaAlreadyExistException");
    private final static QName _RideAlreadyExistException_QNAME = new QName("http://businessLogic/", "RideAlreadyExistException");
    private final static QName _RideMustBeLaterThanTodayException_QNAME = new QName("http://businessLogic/", "RideMustBeLaterThanTodayException");
    private final static QName _AddMezua_QNAME = new QName("http://businessLogic/", "addMezua");
    private final static QName _AddMezuaResponse_QNAME = new QName("http://businessLogic/", "addMezuaResponse");
    private final static QName _AlertaIkusi_QNAME = new QName("http://businessLogic/", "alertaIkusi");
    private final static QName _AlertaIkusiResponse_QNAME = new QName("http://businessLogic/", "alertaIkusiResponse");
    private final static QName _AlertaSortu_QNAME = new QName("http://businessLogic/", "alertaSortu");
    private final static QName _AlertaSortuResponse_QNAME = new QName("http://businessLogic/", "alertaSortuResponse");
    private final static QName _AlertakEguneratu_QNAME = new QName("http://businessLogic/", "alertakEguneratu");
    private final static QName _AlertakEguneratuResponse_QNAME = new QName("http://businessLogic/", "alertakEguneratuResponse");
    private final static QName _BalorazioaErakutsi_QNAME = new QName("http://businessLogic/", "balorazioaErakutsi");
    private final static QName _BalorazioaErakutsiResponse_QNAME = new QName("http://businessLogic/", "balorazioaErakutsiResponse");
    private final static QName _BalorazioaSortu_QNAME = new QName("http://businessLogic/", "balorazioaSortu");
    private final static QName _BalorazioaSortuResponse_QNAME = new QName("http://businessLogic/", "balorazioaSortuResponse");
    private final static QName _BidaiKantzelatu_QNAME = new QName("http://businessLogic/", "bidaiKantzelatu");
    private final static QName _BidaiKantzelatuResponse_QNAME = new QName("http://businessLogic/", "bidaiKantzelatuResponse");
    private final static QName _BidaiariaBaloratuDa_QNAME = new QName("http://businessLogic/", "bidaiariaBaloratuDa");
    private final static QName _BidaiariaBaloratuDaResponse_QNAME = new QName("http://businessLogic/", "bidaiariaBaloratuDaResponse");
    private final static QName _CreateRide_QNAME = new QName("http://businessLogic/", "createRide");
    private final static QName _CreateRideResponse_QNAME = new QName("http://businessLogic/", "createRideResponse");
    private final static QName _DiruaAtera_QNAME = new QName("http://businessLogic/", "diruaAtera");
    private final static QName _DiruaAteraResponse_QNAME = new QName("http://businessLogic/", "diruaAteraResponse");
    private final static QName _DiruaSartu_QNAME = new QName("http://businessLogic/", "diruaSartu");
    private final static QName _DiruaSartuResponse_QNAME = new QName("http://businessLogic/", "diruaSartuResponse");
    private final static QName _EgoeraEzarri_QNAME = new QName("http://businessLogic/", "egoeraEzarri");
    private final static QName _EgoeraEzarriAdmin_QNAME = new QName("http://businessLogic/", "egoeraEzarriAdmin");
    private final static QName _EgoeraEzarriAdminResponse_QNAME = new QName("http://businessLogic/", "egoeraEzarriAdminResponse");
    private final static QName _EgoeraEzarriResponse_QNAME = new QName("http://businessLogic/", "egoeraEzarriResponse");
    private final static QName _ErabiltzaileaBilatu_QNAME = new QName("http://businessLogic/", "erabiltzaileaBilatu");
    private final static QName _ErabiltzaileaBilatuAdmin_QNAME = new QName("http://businessLogic/", "erabiltzaileaBilatuAdmin");
    private final static QName _ErabiltzaileaBilatuAdminResponse_QNAME = new QName("http://businessLogic/", "erabiltzaileaBilatuAdminResponse");
    private final static QName _ErabiltzaileaBilatuResponse_QNAME = new QName("http://businessLogic/", "erabiltzaileaBilatuResponse");
    private final static QName _ErabiltzaileaEzabatu_QNAME = new QName("http://businessLogic/", "erabiltzaileaEzabatu");
    private final static QName _ErabiltzaileaEzabatuResponse_QNAME = new QName("http://businessLogic/", "erabiltzaileaEzabatuResponse");
    private final static QName _Erregistratu_QNAME = new QName("http://businessLogic/", "erregistratu");
    private final static QName _ErregistratuResponse_QNAME = new QName("http://businessLogic/", "erregistratuResponse");
    private final static QName _ErreklamazioaEbatzitaException_QNAME = new QName("http://businessLogic/", "erreklamazioaEbatzitaException");
    private final static QName _ErreklamazioaErakutsiAdmin_QNAME = new QName("http://businessLogic/", "erreklamazioaErakutsiAdmin");
    private final static QName _ErreklamazioaErakutsiAdminResponse_QNAME = new QName("http://businessLogic/", "erreklamazioaErakutsiAdminResponse");
    private final static QName _ErreklamazioaErakutsiBidaiari_QNAME = new QName("http://businessLogic/", "erreklamazioaErakutsiBidaiari");
    private final static QName _ErreklamazioaErakutsiBidaiariResponse_QNAME = new QName("http://businessLogic/", "erreklamazioaErakutsiBidaiariResponse");
    private final static QName _ErreklamazioaErakutsiGidari_QNAME = new QName("http://businessLogic/", "erreklamazioaErakutsiGidari");
    private final static QName _ErreklamazioaErakutsiGidariResponse_QNAME = new QName("http://businessLogic/", "erreklamazioaErakutsiGidariResponse");
    private final static QName _ErreklamazioaLortu_QNAME = new QName("http://businessLogic/", "erreklamazioaLortu");
    private final static QName _ErreklamazioaLortuResponse_QNAME = new QName("http://businessLogic/", "erreklamazioaLortuResponse");
    private final static QName _ErreklamazioaSortu_QNAME = new QName("http://businessLogic/", "erreklamazioaSortu");
    private final static QName _ErreklamazioaSortuResponse_QNAME = new QName("http://businessLogic/", "erreklamazioaSortuResponse");
    private final static QName _ErreserbaBaieztatu_QNAME = new QName("http://businessLogic/", "erreserbaBaieztatu");
    private final static QName _ErreserbaBaieztatuResponse_QNAME = new QName("http://businessLogic/", "erreserbaBaieztatuResponse");
    private final static QName _ErreserbaBaloratuDa_QNAME = new QName("http://businessLogic/", "erreserbaBaloratuDa");
    private final static QName _ErreserbaBaloratuDaResponse_QNAME = new QName("http://businessLogic/", "erreserbaBaloratuDaResponse");
    private final static QName _ErreserbaDeuseztatu_QNAME = new QName("http://businessLogic/", "erreserbaDeuseztatu");
    private final static QName _ErreserbaDeuseztatuResponse_QNAME = new QName("http://businessLogic/", "erreserbaDeuseztatuResponse");
    private final static QName _ErreserbaEgin_QNAME = new QName("http://businessLogic/", "erreserbaEgin");
    private final static QName _ErreserbaEginResponse_QNAME = new QName("http://businessLogic/", "erreserbaEginResponse");
    private final static QName _ErreserbaOnartu_QNAME = new QName("http://businessLogic/", "erreserbaOnartu");
    private final static QName _ErreserbaOnartuResponse_QNAME = new QName("http://businessLogic/", "erreserbaOnartuResponse");
    private final static QName _GetBaloratuGabekoBidaiaAmaituak_QNAME = new QName("http://businessLogic/", "getBaloratuGabekoBidaiaAmaituak");
    private final static QName _GetBaloratuGabekoBidaiaAmaituakResponse_QNAME = new QName("http://businessLogic/", "getBaloratuGabekoBidaiaAmaituakResponse");
    private final static QName _GetBaloratuGabekoErreserbak_QNAME = new QName("http://businessLogic/", "getBaloratuGabekoErreserbak");
    private final static QName _GetBaloratuGabekoErreserbakResponse_QNAME = new QName("http://businessLogic/", "getBaloratuGabekoErreserbakResponse");
    private final static QName _GetBidaiarenErreserbak_QNAME = new QName("http://businessLogic/", "getBidaiarenErreserbak");
    private final static QName _GetBidaiarenErreserbakResponse_QNAME = new QName("http://businessLogic/", "getBidaiarenErreserbakResponse");
    private final static QName _GetBidaiariarenErreserbak_QNAME = new QName("http://businessLogic/", "getBidaiariarenErreserbak");
    private final static QName _GetBidaiariarenErreserbakResponse_QNAME = new QName("http://businessLogic/", "getBidaiariarenErreserbakResponse");
    private final static QName _GetDepartCities_QNAME = new QName("http://businessLogic/", "getDepartCities");
    private final static QName _GetDepartCitiesResponse_QNAME = new QName("http://businessLogic/", "getDepartCitiesResponse");
    private final static QName _GetDestinationCities_QNAME = new QName("http://businessLogic/", "getDestinationCities");
    private final static QName _GetDestinationCitiesResponse_QNAME = new QName("http://businessLogic/", "getDestinationCitiesResponse");
    private final static QName _GetErabiltzailearenMugimenduak_QNAME = new QName("http://businessLogic/", "getErabiltzailearenMugimenduak");
    private final static QName _GetErabiltzailearenMugimenduakResponse_QNAME = new QName("http://businessLogic/", "getErabiltzailearenMugimenduakResponse");
    private final static QName _GetReservedRidesByDriver_QNAME = new QName("http://businessLogic/", "getReservedRidesByDriver");
    private final static QName _GetReservedRidesByDriverResponse_QNAME = new QName("http://businessLogic/", "getReservedRidesByDriverResponse");
    private final static QName _GetRide_QNAME = new QName("http://businessLogic/", "getRide");
    private final static QName _GetRideResponse_QNAME = new QName("http://businessLogic/", "getRideResponse");
    private final static QName _GetRides_QNAME = new QName("http://businessLogic/", "getRides");
    private final static QName _GetRidesByDriver_QNAME = new QName("http://businessLogic/", "getRidesByDriver");
    private final static QName _GetRidesByDriverResponse_QNAME = new QName("http://businessLogic/", "getRidesByDriverResponse");
    private final static QName _GetRidesResponse_QNAME = new QName("http://businessLogic/", "getRidesResponse");
    private final static QName _GetThisMonthDatesWithRides_QNAME = new QName("http://businessLogic/", "getThisMonthDatesWithRides");
    private final static QName _GetThisMonthDatesWithRidesResponse_QNAME = new QName("http://businessLogic/", "getThisMonthDatesWithRidesResponse");
    private final static QName _GetnPlaces_QNAME = new QName("http://businessLogic/", "getnPlaces");
    private final static QName _GetnPlacesResponse_QNAME = new QName("http://businessLogic/", "getnPlacesResponse");
    private final static QName _InitializeBD_QNAME = new QName("http://businessLogic/", "initializeBD");
    private final static QName _InitializeBDResponse_QNAME = new QName("http://businessLogic/", "initializeBDResponse");
    private final static QName _KotxeGehitu_QNAME = new QName("http://businessLogic/", "kotxeGehitu");
    private final static QName _KotxeGehituResponse_QNAME = new QName("http://businessLogic/", "kotxeGehituResponse");
    private final static QName _KotxeakEskuratu_QNAME = new QName("http://businessLogic/", "kotxeakEskuratu");
    private final static QName _KotxeakEskuratuResponse_QNAME = new QName("http://businessLogic/", "kotxeakEskuratuResponse");
    private final static QName _MezuakLortu_QNAME = new QName("http://businessLogic/", "mezuakLortu");
    private final static QName _MezuakLortuResponse_QNAME = new QName("http://businessLogic/", "mezuakLortuResponse");
    private final static QName _SaioaHasi_QNAME = new QName("http://businessLogic/", "saioaHasi");
    private final static QName _SaioaHasiAdmin_QNAME = new QName("http://businessLogic/", "saioaHasiAdmin");
    private final static QName _SaioaHasiAdminResponse_QNAME = new QName("http://businessLogic/", "saioaHasiAdminResponse");
    private final static QName _SaioaHasiResponse_QNAME = new QName("http://businessLogic/", "saioaHasiResponse");
    private final static QName _AdminJasotakoErreklamazioak_QNAME = new QName("", "jasotakoErreklamazioak");
    private final static QName _ErreklamazioaMezuak_QNAME = new QName("", "mezuak");
    private final static QName _UserMugimenduak_QNAME = new QName("", "mugimenduak");
    private final static QName _UserBalorazioak_QNAME = new QName("", "balorazioak");
    private final static QName _BidaiariaErreserbak_QNAME = new QName("", "erreserbak");
    private final static QName _BidaiariaAlertak_QNAME = new QName("", "alertak");
    private final static QName _BidaiariaBidalitakoErreklamazioak_QNAME = new QName("", "bidalitakoErreklamazioak");
    private final static QName _DriverRides_QNAME = new QName("", "rides");
    private final static QName _DriverKotxeak_QNAME = new QName("", "kotxeak");
    private final static QName _DriverJasotakoErreklamazioak_QNAME = new QName("", "JasotakoErreklamazioak");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlertaAlreadyExistException }
     * 
     */
    public AlertaAlreadyExistException createAlertaAlreadyExistException() {
        return new AlertaAlreadyExistException();
    }

    /**
     * Create an instance of {@link KotxeaAlreadyExistException }
     * 
     */
    public KotxeaAlreadyExistException createKotxeaAlreadyExistException() {
        return new KotxeaAlreadyExistException();
    }

    /**
     * Create an instance of {@link RideAlreadyExistException }
     * 
     */
    public RideAlreadyExistException createRideAlreadyExistException() {
        return new RideAlreadyExistException();
    }

    /**
     * Create an instance of {@link RideMustBeLaterThanTodayException }
     * 
     */
    public RideMustBeLaterThanTodayException createRideMustBeLaterThanTodayException() {
        return new RideMustBeLaterThanTodayException();
    }

    /**
     * Create an instance of {@link AddMezua }
     * 
     */
    public AddMezua createAddMezua() {
        return new AddMezua();
    }

    /**
     * Create an instance of {@link AddMezuaResponse }
     * 
     */
    public AddMezuaResponse createAddMezuaResponse() {
        return new AddMezuaResponse();
    }

    /**
     * Create an instance of {@link AlertaIkusi }
     * 
     */
    public AlertaIkusi createAlertaIkusi() {
        return new AlertaIkusi();
    }

    /**
     * Create an instance of {@link AlertaIkusiResponse }
     * 
     */
    public AlertaIkusiResponse createAlertaIkusiResponse() {
        return new AlertaIkusiResponse();
    }

    /**
     * Create an instance of {@link AlertaSortu }
     * 
     */
    public AlertaSortu createAlertaSortu() {
        return new AlertaSortu();
    }

    /**
     * Create an instance of {@link AlertaSortuResponse }
     * 
     */
    public AlertaSortuResponse createAlertaSortuResponse() {
        return new AlertaSortuResponse();
    }

    /**
     * Create an instance of {@link AlertakEguneratu }
     * 
     */
    public AlertakEguneratu createAlertakEguneratu() {
        return new AlertakEguneratu();
    }

    /**
     * Create an instance of {@link AlertakEguneratuResponse }
     * 
     */
    public AlertakEguneratuResponse createAlertakEguneratuResponse() {
        return new AlertakEguneratuResponse();
    }

    /**
     * Create an instance of {@link BalorazioaErakutsi }
     * 
     */
    public BalorazioaErakutsi createBalorazioaErakutsi() {
        return new BalorazioaErakutsi();
    }

    /**
     * Create an instance of {@link BalorazioaErakutsiResponse }
     * 
     */
    public BalorazioaErakutsiResponse createBalorazioaErakutsiResponse() {
        return new BalorazioaErakutsiResponse();
    }

    /**
     * Create an instance of {@link BalorazioaSortu }
     * 
     */
    public BalorazioaSortu createBalorazioaSortu() {
        return new BalorazioaSortu();
    }

    /**
     * Create an instance of {@link BalorazioaSortuResponse }
     * 
     */
    public BalorazioaSortuResponse createBalorazioaSortuResponse() {
        return new BalorazioaSortuResponse();
    }

    /**
     * Create an instance of {@link BidaiKantzelatu }
     * 
     */
    public BidaiKantzelatu createBidaiKantzelatu() {
        return new BidaiKantzelatu();
    }

    /**
     * Create an instance of {@link BidaiKantzelatuResponse }
     * 
     */
    public BidaiKantzelatuResponse createBidaiKantzelatuResponse() {
        return new BidaiKantzelatuResponse();
    }

    /**
     * Create an instance of {@link BidaiariaBaloratuDa }
     * 
     */
    public BidaiariaBaloratuDa createBidaiariaBaloratuDa() {
        return new BidaiariaBaloratuDa();
    }

    /**
     * Create an instance of {@link BidaiariaBaloratuDaResponse }
     * 
     */
    public BidaiariaBaloratuDaResponse createBidaiariaBaloratuDaResponse() {
        return new BidaiariaBaloratuDaResponse();
    }

    /**
     * Create an instance of {@link CreateRide }
     * 
     */
    public CreateRide createCreateRide() {
        return new CreateRide();
    }

    /**
     * Create an instance of {@link CreateRideResponse }
     * 
     */
    public CreateRideResponse createCreateRideResponse() {
        return new CreateRideResponse();
    }

    /**
     * Create an instance of {@link DiruaAtera }
     * 
     */
    public DiruaAtera createDiruaAtera() {
        return new DiruaAtera();
    }

    /**
     * Create an instance of {@link DiruaAteraResponse }
     * 
     */
    public DiruaAteraResponse createDiruaAteraResponse() {
        return new DiruaAteraResponse();
    }

    /**
     * Create an instance of {@link DiruaSartu }
     * 
     */
    public DiruaSartu createDiruaSartu() {
        return new DiruaSartu();
    }

    /**
     * Create an instance of {@link DiruaSartuResponse }
     * 
     */
    public DiruaSartuResponse createDiruaSartuResponse() {
        return new DiruaSartuResponse();
    }

    /**
     * Create an instance of {@link EgoeraEzarri }
     * 
     */
    public EgoeraEzarri createEgoeraEzarri() {
        return new EgoeraEzarri();
    }

    /**
     * Create an instance of {@link EgoeraEzarriAdmin }
     * 
     */
    public EgoeraEzarriAdmin createEgoeraEzarriAdmin() {
        return new EgoeraEzarriAdmin();
    }

    /**
     * Create an instance of {@link EgoeraEzarriAdminResponse }
     * 
     */
    public EgoeraEzarriAdminResponse createEgoeraEzarriAdminResponse() {
        return new EgoeraEzarriAdminResponse();
    }

    /**
     * Create an instance of {@link EgoeraEzarriResponse }
     * 
     */
    public EgoeraEzarriResponse createEgoeraEzarriResponse() {
        return new EgoeraEzarriResponse();
    }

    /**
     * Create an instance of {@link ErabiltzaileaBilatu }
     * 
     */
    public ErabiltzaileaBilatu createErabiltzaileaBilatu() {
        return new ErabiltzaileaBilatu();
    }

    /**
     * Create an instance of {@link ErabiltzaileaBilatuAdmin }
     * 
     */
    public ErabiltzaileaBilatuAdmin createErabiltzaileaBilatuAdmin() {
        return new ErabiltzaileaBilatuAdmin();
    }

    /**
     * Create an instance of {@link ErabiltzaileaBilatuAdminResponse }
     * 
     */
    public ErabiltzaileaBilatuAdminResponse createErabiltzaileaBilatuAdminResponse() {
        return new ErabiltzaileaBilatuAdminResponse();
    }

    /**
     * Create an instance of {@link ErabiltzaileaBilatuResponse }
     * 
     */
    public ErabiltzaileaBilatuResponse createErabiltzaileaBilatuResponse() {
        return new ErabiltzaileaBilatuResponse();
    }

    /**
     * Create an instance of {@link ErabiltzaileaEzabatu }
     * 
     */
    public ErabiltzaileaEzabatu createErabiltzaileaEzabatu() {
        return new ErabiltzaileaEzabatu();
    }

    /**
     * Create an instance of {@link ErabiltzaileaEzabatuResponse }
     * 
     */
    public ErabiltzaileaEzabatuResponse createErabiltzaileaEzabatuResponse() {
        return new ErabiltzaileaEzabatuResponse();
    }

    /**
     * Create an instance of {@link Erregistratu }
     * 
     */
    public Erregistratu createErregistratu() {
        return new Erregistratu();
    }

    /**
     * Create an instance of {@link ErregistratuResponse }
     * 
     */
    public ErregistratuResponse createErregistratuResponse() {
        return new ErregistratuResponse();
    }

    /**
     * Create an instance of {@link ErreklamazioaEbatzitaException }
     * 
     */
    public ErreklamazioaEbatzitaException createErreklamazioaEbatzitaException() {
        return new ErreklamazioaEbatzitaException();
    }

    /**
     * Create an instance of {@link ErreklamazioaErakutsiAdmin }
     * 
     */
    public ErreklamazioaErakutsiAdmin createErreklamazioaErakutsiAdmin() {
        return new ErreklamazioaErakutsiAdmin();
    }

    /**
     * Create an instance of {@link ErreklamazioaErakutsiAdminResponse }
     * 
     */
    public ErreklamazioaErakutsiAdminResponse createErreklamazioaErakutsiAdminResponse() {
        return new ErreklamazioaErakutsiAdminResponse();
    }

    /**
     * Create an instance of {@link ErreklamazioaErakutsiBidaiari }
     * 
     */
    public ErreklamazioaErakutsiBidaiari createErreklamazioaErakutsiBidaiari() {
        return new ErreklamazioaErakutsiBidaiari();
    }

    /**
     * Create an instance of {@link ErreklamazioaErakutsiBidaiariResponse }
     * 
     */
    public ErreklamazioaErakutsiBidaiariResponse createErreklamazioaErakutsiBidaiariResponse() {
        return new ErreklamazioaErakutsiBidaiariResponse();
    }

    /**
     * Create an instance of {@link ErreklamazioaErakutsiGidari }
     * 
     */
    public ErreklamazioaErakutsiGidari createErreklamazioaErakutsiGidari() {
        return new ErreklamazioaErakutsiGidari();
    }

    /**
     * Create an instance of {@link ErreklamazioaErakutsiGidariResponse }
     * 
     */
    public ErreklamazioaErakutsiGidariResponse createErreklamazioaErakutsiGidariResponse() {
        return new ErreklamazioaErakutsiGidariResponse();
    }

    /**
     * Create an instance of {@link ErreklamazioaLortu }
     * 
     */
    public ErreklamazioaLortu createErreklamazioaLortu() {
        return new ErreklamazioaLortu();
    }

    /**
     * Create an instance of {@link ErreklamazioaLortuResponse }
     * 
     */
    public ErreklamazioaLortuResponse createErreklamazioaLortuResponse() {
        return new ErreklamazioaLortuResponse();
    }

    /**
     * Create an instance of {@link ErreklamazioaSortu }
     * 
     */
    public ErreklamazioaSortu createErreklamazioaSortu() {
        return new ErreklamazioaSortu();
    }

    /**
     * Create an instance of {@link ErreklamazioaSortuResponse }
     * 
     */
    public ErreklamazioaSortuResponse createErreklamazioaSortuResponse() {
        return new ErreklamazioaSortuResponse();
    }

    /**
     * Create an instance of {@link ErreserbaBaieztatu }
     * 
     */
    public ErreserbaBaieztatu createErreserbaBaieztatu() {
        return new ErreserbaBaieztatu();
    }

    /**
     * Create an instance of {@link ErreserbaBaieztatuResponse }
     * 
     */
    public ErreserbaBaieztatuResponse createErreserbaBaieztatuResponse() {
        return new ErreserbaBaieztatuResponse();
    }

    /**
     * Create an instance of {@link ErreserbaBaloratuDa }
     * 
     */
    public ErreserbaBaloratuDa createErreserbaBaloratuDa() {
        return new ErreserbaBaloratuDa();
    }

    /**
     * Create an instance of {@link ErreserbaBaloratuDaResponse }
     * 
     */
    public ErreserbaBaloratuDaResponse createErreserbaBaloratuDaResponse() {
        return new ErreserbaBaloratuDaResponse();
    }

    /**
     * Create an instance of {@link ErreserbaDeuseztatu }
     * 
     */
    public ErreserbaDeuseztatu createErreserbaDeuseztatu() {
        return new ErreserbaDeuseztatu();
    }

    /**
     * Create an instance of {@link ErreserbaDeuseztatuResponse }
     * 
     */
    public ErreserbaDeuseztatuResponse createErreserbaDeuseztatuResponse() {
        return new ErreserbaDeuseztatuResponse();
    }

    /**
     * Create an instance of {@link ErreserbaEgin }
     * 
     */
    public ErreserbaEgin createErreserbaEgin() {
        return new ErreserbaEgin();
    }

    /**
     * Create an instance of {@link ErreserbaEginResponse }
     * 
     */
    public ErreserbaEginResponse createErreserbaEginResponse() {
        return new ErreserbaEginResponse();
    }

    /**
     * Create an instance of {@link ErreserbaOnartu }
     * 
     */
    public ErreserbaOnartu createErreserbaOnartu() {
        return new ErreserbaOnartu();
    }

    /**
     * Create an instance of {@link ErreserbaOnartuResponse }
     * 
     */
    public ErreserbaOnartuResponse createErreserbaOnartuResponse() {
        return new ErreserbaOnartuResponse();
    }

    /**
     * Create an instance of {@link GetBaloratuGabekoBidaiaAmaituak }
     * 
     */
    public GetBaloratuGabekoBidaiaAmaituak createGetBaloratuGabekoBidaiaAmaituak() {
        return new GetBaloratuGabekoBidaiaAmaituak();
    }

    /**
     * Create an instance of {@link GetBaloratuGabekoBidaiaAmaituakResponse }
     * 
     */
    public GetBaloratuGabekoBidaiaAmaituakResponse createGetBaloratuGabekoBidaiaAmaituakResponse() {
        return new GetBaloratuGabekoBidaiaAmaituakResponse();
    }

    /**
     * Create an instance of {@link GetBaloratuGabekoErreserbak }
     * 
     */
    public GetBaloratuGabekoErreserbak createGetBaloratuGabekoErreserbak() {
        return new GetBaloratuGabekoErreserbak();
    }

    /**
     * Create an instance of {@link GetBaloratuGabekoErreserbakResponse }
     * 
     */
    public GetBaloratuGabekoErreserbakResponse createGetBaloratuGabekoErreserbakResponse() {
        return new GetBaloratuGabekoErreserbakResponse();
    }

    /**
     * Create an instance of {@link GetBidaiarenErreserbak }
     * 
     */
    public GetBidaiarenErreserbak createGetBidaiarenErreserbak() {
        return new GetBidaiarenErreserbak();
    }

    /**
     * Create an instance of {@link GetBidaiarenErreserbakResponse }
     * 
     */
    public GetBidaiarenErreserbakResponse createGetBidaiarenErreserbakResponse() {
        return new GetBidaiarenErreserbakResponse();
    }

    /**
     * Create an instance of {@link GetBidaiariarenErreserbak }
     * 
     */
    public GetBidaiariarenErreserbak createGetBidaiariarenErreserbak() {
        return new GetBidaiariarenErreserbak();
    }

    /**
     * Create an instance of {@link GetBidaiariarenErreserbakResponse }
     * 
     */
    public GetBidaiariarenErreserbakResponse createGetBidaiariarenErreserbakResponse() {
        return new GetBidaiariarenErreserbakResponse();
    }

    /**
     * Create an instance of {@link GetDepartCities }
     * 
     */
    public GetDepartCities createGetDepartCities() {
        return new GetDepartCities();
    }

    /**
     * Create an instance of {@link GetDepartCitiesResponse }
     * 
     */
    public GetDepartCitiesResponse createGetDepartCitiesResponse() {
        return new GetDepartCitiesResponse();
    }

    /**
     * Create an instance of {@link GetDestinationCities }
     * 
     */
    public GetDestinationCities createGetDestinationCities() {
        return new GetDestinationCities();
    }

    /**
     * Create an instance of {@link GetDestinationCitiesResponse }
     * 
     */
    public GetDestinationCitiesResponse createGetDestinationCitiesResponse() {
        return new GetDestinationCitiesResponse();
    }

    /**
     * Create an instance of {@link GetErabiltzailearenMugimenduak }
     * 
     */
    public GetErabiltzailearenMugimenduak createGetErabiltzailearenMugimenduak() {
        return new GetErabiltzailearenMugimenduak();
    }

    /**
     * Create an instance of {@link GetErabiltzailearenMugimenduakResponse }
     * 
     */
    public GetErabiltzailearenMugimenduakResponse createGetErabiltzailearenMugimenduakResponse() {
        return new GetErabiltzailearenMugimenduakResponse();
    }

    /**
     * Create an instance of {@link GetReservedRidesByDriver }
     * 
     */
    public GetReservedRidesByDriver createGetReservedRidesByDriver() {
        return new GetReservedRidesByDriver();
    }

    /**
     * Create an instance of {@link GetReservedRidesByDriverResponse }
     * 
     */
    public GetReservedRidesByDriverResponse createGetReservedRidesByDriverResponse() {
        return new GetReservedRidesByDriverResponse();
    }

    /**
     * Create an instance of {@link GetRide }
     * 
     */
    public GetRide createGetRide() {
        return new GetRide();
    }

    /**
     * Create an instance of {@link GetRideResponse }
     * 
     */
    public GetRideResponse createGetRideResponse() {
        return new GetRideResponse();
    }

    /**
     * Create an instance of {@link GetRides }
     * 
     */
    public GetRides createGetRides() {
        return new GetRides();
    }

    /**
     * Create an instance of {@link GetRidesByDriver }
     * 
     */
    public GetRidesByDriver createGetRidesByDriver() {
        return new GetRidesByDriver();
    }

    /**
     * Create an instance of {@link GetRidesByDriverResponse }
     * 
     */
    public GetRidesByDriverResponse createGetRidesByDriverResponse() {
        return new GetRidesByDriverResponse();
    }

    /**
     * Create an instance of {@link GetRidesResponse }
     * 
     */
    public GetRidesResponse createGetRidesResponse() {
        return new GetRidesResponse();
    }

    /**
     * Create an instance of {@link GetThisMonthDatesWithRides }
     * 
     */
    public GetThisMonthDatesWithRides createGetThisMonthDatesWithRides() {
        return new GetThisMonthDatesWithRides();
    }

    /**
     * Create an instance of {@link GetThisMonthDatesWithRidesResponse }
     * 
     */
    public GetThisMonthDatesWithRidesResponse createGetThisMonthDatesWithRidesResponse() {
        return new GetThisMonthDatesWithRidesResponse();
    }

    /**
     * Create an instance of {@link GetnPlaces }
     * 
     */
    public GetnPlaces createGetnPlaces() {
        return new GetnPlaces();
    }

    /**
     * Create an instance of {@link GetnPlacesResponse }
     * 
     */
    public GetnPlacesResponse createGetnPlacesResponse() {
        return new GetnPlacesResponse();
    }

    /**
     * Create an instance of {@link InitializeBD }
     * 
     */
    public InitializeBD createInitializeBD() {
        return new InitializeBD();
    }

    /**
     * Create an instance of {@link InitializeBDResponse }
     * 
     */
    public InitializeBDResponse createInitializeBDResponse() {
        return new InitializeBDResponse();
    }

    /**
     * Create an instance of {@link KotxeGehitu }
     * 
     */
    public KotxeGehitu createKotxeGehitu() {
        return new KotxeGehitu();
    }

    /**
     * Create an instance of {@link KotxeGehituResponse }
     * 
     */
    public KotxeGehituResponse createKotxeGehituResponse() {
        return new KotxeGehituResponse();
    }

    /**
     * Create an instance of {@link KotxeakEskuratu }
     * 
     */
    public KotxeakEskuratu createKotxeakEskuratu() {
        return new KotxeakEskuratu();
    }

    /**
     * Create an instance of {@link KotxeakEskuratuResponse }
     * 
     */
    public KotxeakEskuratuResponse createKotxeakEskuratuResponse() {
        return new KotxeakEskuratuResponse();
    }

    /**
     * Create an instance of {@link MezuakLortu }
     * 
     */
    public MezuakLortu createMezuakLortu() {
        return new MezuakLortu();
    }

    /**
     * Create an instance of {@link MezuakLortuResponse }
     * 
     */
    public MezuakLortuResponse createMezuakLortuResponse() {
        return new MezuakLortuResponse();
    }

    /**
     * Create an instance of {@link SaioaHasi }
     * 
     */
    public SaioaHasi createSaioaHasi() {
        return new SaioaHasi();
    }

    /**
     * Create an instance of {@link SaioaHasiAdmin }
     * 
     */
    public SaioaHasiAdmin createSaioaHasiAdmin() {
        return new SaioaHasiAdmin();
    }

    /**
     * Create an instance of {@link SaioaHasiAdminResponse }
     * 
     */
    public SaioaHasiAdminResponse createSaioaHasiAdminResponse() {
        return new SaioaHasiAdminResponse();
    }

    /**
     * Create an instance of {@link SaioaHasiResponse }
     * 
     */
    public SaioaHasiResponse createSaioaHasiResponse() {
        return new SaioaHasiResponse();
    }

    /**
     * Create an instance of {@link Driver }
     * 
     */
    public Driver createDriver() {
        return new Driver();
    }

    /**
     * Create an instance of {@link Ride }
     * 
     */
    public Ride createRide() {
        return new Ride();
    }

    /**
     * Create an instance of {@link Erreserba }
     * 
     */
    public Erreserba createErreserba() {
        return new Erreserba();
    }

    /**
     * Create an instance of {@link Bidaiaria }
     * 
     */
    public Bidaiaria createBidaiaria() {
        return new Bidaiaria();
    }

    /**
     * Create an instance of {@link Alerta }
     * 
     */
    public Alerta createAlerta() {
        return new Alerta();
    }

    /**
     * Create an instance of {@link Erreklamazioa }
     * 
     */
    public Erreklamazioa createErreklamazioa() {
        return new Erreklamazioa();
    }

    /**
     * Create an instance of {@link Admin }
     * 
     */
    public Admin createAdmin() {
        return new Admin();
    }

    /**
     * Create an instance of {@link Mezua }
     * 
     */
    public Mezua createMezua() {
        return new Mezua();
    }

    /**
     * Create an instance of {@link Mugimendua }
     * 
     */
    public Mugimendua createMugimendua() {
        return new Mugimendua();
    }

    /**
     * Create an instance of {@link Balorazioa }
     * 
     */
    public Balorazioa createBalorazioa() {
        return new Balorazioa();
    }

    /**
     * Create an instance of {@link Kotxea }
     * 
     */
    public Kotxea createKotxea() {
        return new Kotxea();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertaAlreadyExistException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlertaAlreadyExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "AlertaAlreadyExistException")
    public JAXBElement<AlertaAlreadyExistException> createAlertaAlreadyExistException(AlertaAlreadyExistException value) {
        return new JAXBElement<AlertaAlreadyExistException>(_AlertaAlreadyExistException_QNAME, AlertaAlreadyExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KotxeaAlreadyExistException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KotxeaAlreadyExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "KotxeaAlreadyExistException")
    public JAXBElement<KotxeaAlreadyExistException> createKotxeaAlreadyExistException(KotxeaAlreadyExistException value) {
        return new JAXBElement<KotxeaAlreadyExistException>(_KotxeaAlreadyExistException_QNAME, KotxeaAlreadyExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RideAlreadyExistException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RideAlreadyExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "RideAlreadyExistException")
    public JAXBElement<RideAlreadyExistException> createRideAlreadyExistException(RideAlreadyExistException value) {
        return new JAXBElement<RideAlreadyExistException>(_RideAlreadyExistException_QNAME, RideAlreadyExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RideMustBeLaterThanTodayException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RideMustBeLaterThanTodayException }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "RideMustBeLaterThanTodayException")
    public JAXBElement<RideMustBeLaterThanTodayException> createRideMustBeLaterThanTodayException(RideMustBeLaterThanTodayException value) {
        return new JAXBElement<RideMustBeLaterThanTodayException>(_RideMustBeLaterThanTodayException_QNAME, RideMustBeLaterThanTodayException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMezua }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMezua }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "addMezua")
    public JAXBElement<AddMezua> createAddMezua(AddMezua value) {
        return new JAXBElement<AddMezua>(_AddMezua_QNAME, AddMezua.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMezuaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMezuaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "addMezuaResponse")
    public JAXBElement<AddMezuaResponse> createAddMezuaResponse(AddMezuaResponse value) {
        return new JAXBElement<AddMezuaResponse>(_AddMezuaResponse_QNAME, AddMezuaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertaIkusi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlertaIkusi }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "alertaIkusi")
    public JAXBElement<AlertaIkusi> createAlertaIkusi(AlertaIkusi value) {
        return new JAXBElement<AlertaIkusi>(_AlertaIkusi_QNAME, AlertaIkusi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertaIkusiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlertaIkusiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "alertaIkusiResponse")
    public JAXBElement<AlertaIkusiResponse> createAlertaIkusiResponse(AlertaIkusiResponse value) {
        return new JAXBElement<AlertaIkusiResponse>(_AlertaIkusiResponse_QNAME, AlertaIkusiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertaSortu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlertaSortu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "alertaSortu")
    public JAXBElement<AlertaSortu> createAlertaSortu(AlertaSortu value) {
        return new JAXBElement<AlertaSortu>(_AlertaSortu_QNAME, AlertaSortu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertaSortuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlertaSortuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "alertaSortuResponse")
    public JAXBElement<AlertaSortuResponse> createAlertaSortuResponse(AlertaSortuResponse value) {
        return new JAXBElement<AlertaSortuResponse>(_AlertaSortuResponse_QNAME, AlertaSortuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertakEguneratu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlertakEguneratu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "alertakEguneratu")
    public JAXBElement<AlertakEguneratu> createAlertakEguneratu(AlertakEguneratu value) {
        return new JAXBElement<AlertakEguneratu>(_AlertakEguneratu_QNAME, AlertakEguneratu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertakEguneratuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlertakEguneratuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "alertakEguneratuResponse")
    public JAXBElement<AlertakEguneratuResponse> createAlertakEguneratuResponse(AlertakEguneratuResponse value) {
        return new JAXBElement<AlertakEguneratuResponse>(_AlertakEguneratuResponse_QNAME, AlertakEguneratuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalorazioaErakutsi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BalorazioaErakutsi }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "balorazioaErakutsi")
    public JAXBElement<BalorazioaErakutsi> createBalorazioaErakutsi(BalorazioaErakutsi value) {
        return new JAXBElement<BalorazioaErakutsi>(_BalorazioaErakutsi_QNAME, BalorazioaErakutsi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalorazioaErakutsiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BalorazioaErakutsiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "balorazioaErakutsiResponse")
    public JAXBElement<BalorazioaErakutsiResponse> createBalorazioaErakutsiResponse(BalorazioaErakutsiResponse value) {
        return new JAXBElement<BalorazioaErakutsiResponse>(_BalorazioaErakutsiResponse_QNAME, BalorazioaErakutsiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalorazioaSortu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BalorazioaSortu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "balorazioaSortu")
    public JAXBElement<BalorazioaSortu> createBalorazioaSortu(BalorazioaSortu value) {
        return new JAXBElement<BalorazioaSortu>(_BalorazioaSortu_QNAME, BalorazioaSortu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalorazioaSortuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BalorazioaSortuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "balorazioaSortuResponse")
    public JAXBElement<BalorazioaSortuResponse> createBalorazioaSortuResponse(BalorazioaSortuResponse value) {
        return new JAXBElement<BalorazioaSortuResponse>(_BalorazioaSortuResponse_QNAME, BalorazioaSortuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidaiKantzelatu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BidaiKantzelatu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "bidaiKantzelatu")
    public JAXBElement<BidaiKantzelatu> createBidaiKantzelatu(BidaiKantzelatu value) {
        return new JAXBElement<BidaiKantzelatu>(_BidaiKantzelatu_QNAME, BidaiKantzelatu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidaiKantzelatuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BidaiKantzelatuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "bidaiKantzelatuResponse")
    public JAXBElement<BidaiKantzelatuResponse> createBidaiKantzelatuResponse(BidaiKantzelatuResponse value) {
        return new JAXBElement<BidaiKantzelatuResponse>(_BidaiKantzelatuResponse_QNAME, BidaiKantzelatuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidaiariaBaloratuDa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BidaiariaBaloratuDa }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "bidaiariaBaloratuDa")
    public JAXBElement<BidaiariaBaloratuDa> createBidaiariaBaloratuDa(BidaiariaBaloratuDa value) {
        return new JAXBElement<BidaiariaBaloratuDa>(_BidaiariaBaloratuDa_QNAME, BidaiariaBaloratuDa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidaiariaBaloratuDaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BidaiariaBaloratuDaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "bidaiariaBaloratuDaResponse")
    public JAXBElement<BidaiariaBaloratuDaResponse> createBidaiariaBaloratuDaResponse(BidaiariaBaloratuDaResponse value) {
        return new JAXBElement<BidaiariaBaloratuDaResponse>(_BidaiariaBaloratuDaResponse_QNAME, BidaiariaBaloratuDaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRide }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateRide }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "createRide")
    public JAXBElement<CreateRide> createCreateRide(CreateRide value) {
        return new JAXBElement<CreateRide>(_CreateRide_QNAME, CreateRide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRideResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateRideResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "createRideResponse")
    public JAXBElement<CreateRideResponse> createCreateRideResponse(CreateRideResponse value) {
        return new JAXBElement<CreateRideResponse>(_CreateRideResponse_QNAME, CreateRideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiruaAtera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiruaAtera }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "diruaAtera")
    public JAXBElement<DiruaAtera> createDiruaAtera(DiruaAtera value) {
        return new JAXBElement<DiruaAtera>(_DiruaAtera_QNAME, DiruaAtera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiruaAteraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiruaAteraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "diruaAteraResponse")
    public JAXBElement<DiruaAteraResponse> createDiruaAteraResponse(DiruaAteraResponse value) {
        return new JAXBElement<DiruaAteraResponse>(_DiruaAteraResponse_QNAME, DiruaAteraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiruaSartu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiruaSartu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "diruaSartu")
    public JAXBElement<DiruaSartu> createDiruaSartu(DiruaSartu value) {
        return new JAXBElement<DiruaSartu>(_DiruaSartu_QNAME, DiruaSartu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiruaSartuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiruaSartuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "diruaSartuResponse")
    public JAXBElement<DiruaSartuResponse> createDiruaSartuResponse(DiruaSartuResponse value) {
        return new JAXBElement<DiruaSartuResponse>(_DiruaSartuResponse_QNAME, DiruaSartuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgoeraEzarri }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EgoeraEzarri }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "egoeraEzarri")
    public JAXBElement<EgoeraEzarri> createEgoeraEzarri(EgoeraEzarri value) {
        return new JAXBElement<EgoeraEzarri>(_EgoeraEzarri_QNAME, EgoeraEzarri.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgoeraEzarriAdmin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EgoeraEzarriAdmin }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "egoeraEzarriAdmin")
    public JAXBElement<EgoeraEzarriAdmin> createEgoeraEzarriAdmin(EgoeraEzarriAdmin value) {
        return new JAXBElement<EgoeraEzarriAdmin>(_EgoeraEzarriAdmin_QNAME, EgoeraEzarriAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgoeraEzarriAdminResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EgoeraEzarriAdminResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "egoeraEzarriAdminResponse")
    public JAXBElement<EgoeraEzarriAdminResponse> createEgoeraEzarriAdminResponse(EgoeraEzarriAdminResponse value) {
        return new JAXBElement<EgoeraEzarriAdminResponse>(_EgoeraEzarriAdminResponse_QNAME, EgoeraEzarriAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgoeraEzarriResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EgoeraEzarriResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "egoeraEzarriResponse")
    public JAXBElement<EgoeraEzarriResponse> createEgoeraEzarriResponse(EgoeraEzarriResponse value) {
        return new JAXBElement<EgoeraEzarriResponse>(_EgoeraEzarriResponse_QNAME, EgoeraEzarriResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaBilatu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaBilatu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erabiltzaileaBilatu")
    public JAXBElement<ErabiltzaileaBilatu> createErabiltzaileaBilatu(ErabiltzaileaBilatu value) {
        return new JAXBElement<ErabiltzaileaBilatu>(_ErabiltzaileaBilatu_QNAME, ErabiltzaileaBilatu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaBilatuAdmin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaBilatuAdmin }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erabiltzaileaBilatuAdmin")
    public JAXBElement<ErabiltzaileaBilatuAdmin> createErabiltzaileaBilatuAdmin(ErabiltzaileaBilatuAdmin value) {
        return new JAXBElement<ErabiltzaileaBilatuAdmin>(_ErabiltzaileaBilatuAdmin_QNAME, ErabiltzaileaBilatuAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaBilatuAdminResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaBilatuAdminResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erabiltzaileaBilatuAdminResponse")
    public JAXBElement<ErabiltzaileaBilatuAdminResponse> createErabiltzaileaBilatuAdminResponse(ErabiltzaileaBilatuAdminResponse value) {
        return new JAXBElement<ErabiltzaileaBilatuAdminResponse>(_ErabiltzaileaBilatuAdminResponse_QNAME, ErabiltzaileaBilatuAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaBilatuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaBilatuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erabiltzaileaBilatuResponse")
    public JAXBElement<ErabiltzaileaBilatuResponse> createErabiltzaileaBilatuResponse(ErabiltzaileaBilatuResponse value) {
        return new JAXBElement<ErabiltzaileaBilatuResponse>(_ErabiltzaileaBilatuResponse_QNAME, ErabiltzaileaBilatuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaEzabatu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaEzabatu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erabiltzaileaEzabatu")
    public JAXBElement<ErabiltzaileaEzabatu> createErabiltzaileaEzabatu(ErabiltzaileaEzabatu value) {
        return new JAXBElement<ErabiltzaileaEzabatu>(_ErabiltzaileaEzabatu_QNAME, ErabiltzaileaEzabatu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaEzabatuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaEzabatuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erabiltzaileaEzabatuResponse")
    public JAXBElement<ErabiltzaileaEzabatuResponse> createErabiltzaileaEzabatuResponse(ErabiltzaileaEzabatuResponse value) {
        return new JAXBElement<ErabiltzaileaEzabatuResponse>(_ErabiltzaileaEzabatuResponse_QNAME, ErabiltzaileaEzabatuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Erregistratu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Erregistratu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erregistratu")
    public JAXBElement<Erregistratu> createErregistratu(Erregistratu value) {
        return new JAXBElement<Erregistratu>(_Erregistratu_QNAME, Erregistratu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErregistratuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErregistratuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erregistratuResponse")
    public JAXBElement<ErregistratuResponse> createErregistratuResponse(ErregistratuResponse value) {
        return new JAXBElement<ErregistratuResponse>(_ErregistratuResponse_QNAME, ErregistratuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaEbatzitaException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaEbatzitaException }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaEbatzitaException")
    public JAXBElement<ErreklamazioaEbatzitaException> createErreklamazioaEbatzitaException(ErreklamazioaEbatzitaException value) {
        return new JAXBElement<ErreklamazioaEbatzitaException>(_ErreklamazioaEbatzitaException_QNAME, ErreklamazioaEbatzitaException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaErakutsiAdmin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaErakutsiAdmin }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaErakutsiAdmin")
    public JAXBElement<ErreklamazioaErakutsiAdmin> createErreklamazioaErakutsiAdmin(ErreklamazioaErakutsiAdmin value) {
        return new JAXBElement<ErreklamazioaErakutsiAdmin>(_ErreklamazioaErakutsiAdmin_QNAME, ErreklamazioaErakutsiAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaErakutsiAdminResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaErakutsiAdminResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaErakutsiAdminResponse")
    public JAXBElement<ErreklamazioaErakutsiAdminResponse> createErreklamazioaErakutsiAdminResponse(ErreklamazioaErakutsiAdminResponse value) {
        return new JAXBElement<ErreklamazioaErakutsiAdminResponse>(_ErreklamazioaErakutsiAdminResponse_QNAME, ErreklamazioaErakutsiAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaErakutsiBidaiari }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaErakutsiBidaiari }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaErakutsiBidaiari")
    public JAXBElement<ErreklamazioaErakutsiBidaiari> createErreklamazioaErakutsiBidaiari(ErreklamazioaErakutsiBidaiari value) {
        return new JAXBElement<ErreklamazioaErakutsiBidaiari>(_ErreklamazioaErakutsiBidaiari_QNAME, ErreklamazioaErakutsiBidaiari.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaErakutsiBidaiariResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaErakutsiBidaiariResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaErakutsiBidaiariResponse")
    public JAXBElement<ErreklamazioaErakutsiBidaiariResponse> createErreklamazioaErakutsiBidaiariResponse(ErreklamazioaErakutsiBidaiariResponse value) {
        return new JAXBElement<ErreklamazioaErakutsiBidaiariResponse>(_ErreklamazioaErakutsiBidaiariResponse_QNAME, ErreklamazioaErakutsiBidaiariResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaErakutsiGidari }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaErakutsiGidari }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaErakutsiGidari")
    public JAXBElement<ErreklamazioaErakutsiGidari> createErreklamazioaErakutsiGidari(ErreklamazioaErakutsiGidari value) {
        return new JAXBElement<ErreklamazioaErakutsiGidari>(_ErreklamazioaErakutsiGidari_QNAME, ErreklamazioaErakutsiGidari.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaErakutsiGidariResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaErakutsiGidariResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaErakutsiGidariResponse")
    public JAXBElement<ErreklamazioaErakutsiGidariResponse> createErreklamazioaErakutsiGidariResponse(ErreklamazioaErakutsiGidariResponse value) {
        return new JAXBElement<ErreklamazioaErakutsiGidariResponse>(_ErreklamazioaErakutsiGidariResponse_QNAME, ErreklamazioaErakutsiGidariResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaLortu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaLortu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaLortu")
    public JAXBElement<ErreklamazioaLortu> createErreklamazioaLortu(ErreklamazioaLortu value) {
        return new JAXBElement<ErreklamazioaLortu>(_ErreklamazioaLortu_QNAME, ErreklamazioaLortu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaLortuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaLortuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaLortuResponse")
    public JAXBElement<ErreklamazioaLortuResponse> createErreklamazioaLortuResponse(ErreklamazioaLortuResponse value) {
        return new JAXBElement<ErreklamazioaLortuResponse>(_ErreklamazioaLortuResponse_QNAME, ErreklamazioaLortuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaSortu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaSortu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaSortu")
    public JAXBElement<ErreklamazioaSortu> createErreklamazioaSortu(ErreklamazioaSortu value) {
        return new JAXBElement<ErreklamazioaSortu>(_ErreklamazioaSortu_QNAME, ErreklamazioaSortu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaSortuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaSortuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaSortuResponse")
    public JAXBElement<ErreklamazioaSortuResponse> createErreklamazioaSortuResponse(ErreklamazioaSortuResponse value) {
        return new JAXBElement<ErreklamazioaSortuResponse>(_ErreklamazioaSortuResponse_QNAME, ErreklamazioaSortuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreserbaBaieztatu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreserbaBaieztatu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreserbaBaieztatu")
    public JAXBElement<ErreserbaBaieztatu> createErreserbaBaieztatu(ErreserbaBaieztatu value) {
        return new JAXBElement<ErreserbaBaieztatu>(_ErreserbaBaieztatu_QNAME, ErreserbaBaieztatu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreserbaBaieztatuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreserbaBaieztatuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreserbaBaieztatuResponse")
    public JAXBElement<ErreserbaBaieztatuResponse> createErreserbaBaieztatuResponse(ErreserbaBaieztatuResponse value) {
        return new JAXBElement<ErreserbaBaieztatuResponse>(_ErreserbaBaieztatuResponse_QNAME, ErreserbaBaieztatuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreserbaBaloratuDa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreserbaBaloratuDa }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreserbaBaloratuDa")
    public JAXBElement<ErreserbaBaloratuDa> createErreserbaBaloratuDa(ErreserbaBaloratuDa value) {
        return new JAXBElement<ErreserbaBaloratuDa>(_ErreserbaBaloratuDa_QNAME, ErreserbaBaloratuDa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreserbaBaloratuDaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreserbaBaloratuDaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreserbaBaloratuDaResponse")
    public JAXBElement<ErreserbaBaloratuDaResponse> createErreserbaBaloratuDaResponse(ErreserbaBaloratuDaResponse value) {
        return new JAXBElement<ErreserbaBaloratuDaResponse>(_ErreserbaBaloratuDaResponse_QNAME, ErreserbaBaloratuDaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreserbaDeuseztatu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreserbaDeuseztatu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreserbaDeuseztatu")
    public JAXBElement<ErreserbaDeuseztatu> createErreserbaDeuseztatu(ErreserbaDeuseztatu value) {
        return new JAXBElement<ErreserbaDeuseztatu>(_ErreserbaDeuseztatu_QNAME, ErreserbaDeuseztatu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreserbaDeuseztatuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreserbaDeuseztatuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreserbaDeuseztatuResponse")
    public JAXBElement<ErreserbaDeuseztatuResponse> createErreserbaDeuseztatuResponse(ErreserbaDeuseztatuResponse value) {
        return new JAXBElement<ErreserbaDeuseztatuResponse>(_ErreserbaDeuseztatuResponse_QNAME, ErreserbaDeuseztatuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreserbaEgin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreserbaEgin }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreserbaEgin")
    public JAXBElement<ErreserbaEgin> createErreserbaEgin(ErreserbaEgin value) {
        return new JAXBElement<ErreserbaEgin>(_ErreserbaEgin_QNAME, ErreserbaEgin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreserbaEginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreserbaEginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreserbaEginResponse")
    public JAXBElement<ErreserbaEginResponse> createErreserbaEginResponse(ErreserbaEginResponse value) {
        return new JAXBElement<ErreserbaEginResponse>(_ErreserbaEginResponse_QNAME, ErreserbaEginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreserbaOnartu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreserbaOnartu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreserbaOnartu")
    public JAXBElement<ErreserbaOnartu> createErreserbaOnartu(ErreserbaOnartu value) {
        return new JAXBElement<ErreserbaOnartu>(_ErreserbaOnartu_QNAME, ErreserbaOnartu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreserbaOnartuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreserbaOnartuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreserbaOnartuResponse")
    public JAXBElement<ErreserbaOnartuResponse> createErreserbaOnartuResponse(ErreserbaOnartuResponse value) {
        return new JAXBElement<ErreserbaOnartuResponse>(_ErreserbaOnartuResponse_QNAME, ErreserbaOnartuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBaloratuGabekoBidaiaAmaituak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBaloratuGabekoBidaiaAmaituak }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getBaloratuGabekoBidaiaAmaituak")
    public JAXBElement<GetBaloratuGabekoBidaiaAmaituak> createGetBaloratuGabekoBidaiaAmaituak(GetBaloratuGabekoBidaiaAmaituak value) {
        return new JAXBElement<GetBaloratuGabekoBidaiaAmaituak>(_GetBaloratuGabekoBidaiaAmaituak_QNAME, GetBaloratuGabekoBidaiaAmaituak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBaloratuGabekoBidaiaAmaituakResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBaloratuGabekoBidaiaAmaituakResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getBaloratuGabekoBidaiaAmaituakResponse")
    public JAXBElement<GetBaloratuGabekoBidaiaAmaituakResponse> createGetBaloratuGabekoBidaiaAmaituakResponse(GetBaloratuGabekoBidaiaAmaituakResponse value) {
        return new JAXBElement<GetBaloratuGabekoBidaiaAmaituakResponse>(_GetBaloratuGabekoBidaiaAmaituakResponse_QNAME, GetBaloratuGabekoBidaiaAmaituakResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBaloratuGabekoErreserbak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBaloratuGabekoErreserbak }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getBaloratuGabekoErreserbak")
    public JAXBElement<GetBaloratuGabekoErreserbak> createGetBaloratuGabekoErreserbak(GetBaloratuGabekoErreserbak value) {
        return new JAXBElement<GetBaloratuGabekoErreserbak>(_GetBaloratuGabekoErreserbak_QNAME, GetBaloratuGabekoErreserbak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBaloratuGabekoErreserbakResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBaloratuGabekoErreserbakResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getBaloratuGabekoErreserbakResponse")
    public JAXBElement<GetBaloratuGabekoErreserbakResponse> createGetBaloratuGabekoErreserbakResponse(GetBaloratuGabekoErreserbakResponse value) {
        return new JAXBElement<GetBaloratuGabekoErreserbakResponse>(_GetBaloratuGabekoErreserbakResponse_QNAME, GetBaloratuGabekoErreserbakResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBidaiarenErreserbak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBidaiarenErreserbak }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getBidaiarenErreserbak")
    public JAXBElement<GetBidaiarenErreserbak> createGetBidaiarenErreserbak(GetBidaiarenErreserbak value) {
        return new JAXBElement<GetBidaiarenErreserbak>(_GetBidaiarenErreserbak_QNAME, GetBidaiarenErreserbak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBidaiarenErreserbakResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBidaiarenErreserbakResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getBidaiarenErreserbakResponse")
    public JAXBElement<GetBidaiarenErreserbakResponse> createGetBidaiarenErreserbakResponse(GetBidaiarenErreserbakResponse value) {
        return new JAXBElement<GetBidaiarenErreserbakResponse>(_GetBidaiarenErreserbakResponse_QNAME, GetBidaiarenErreserbakResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBidaiariarenErreserbak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBidaiariarenErreserbak }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getBidaiariarenErreserbak")
    public JAXBElement<GetBidaiariarenErreserbak> createGetBidaiariarenErreserbak(GetBidaiariarenErreserbak value) {
        return new JAXBElement<GetBidaiariarenErreserbak>(_GetBidaiariarenErreserbak_QNAME, GetBidaiariarenErreserbak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBidaiariarenErreserbakResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBidaiariarenErreserbakResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getBidaiariarenErreserbakResponse")
    public JAXBElement<GetBidaiariarenErreserbakResponse> createGetBidaiariarenErreserbakResponse(GetBidaiariarenErreserbakResponse value) {
        return new JAXBElement<GetBidaiariarenErreserbakResponse>(_GetBidaiariarenErreserbakResponse_QNAME, GetBidaiariarenErreserbakResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartCities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDepartCities }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDepartCities")
    public JAXBElement<GetDepartCities> createGetDepartCities(GetDepartCities value) {
        return new JAXBElement<GetDepartCities>(_GetDepartCities_QNAME, GetDepartCities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartCitiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDepartCitiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDepartCitiesResponse")
    public JAXBElement<GetDepartCitiesResponse> createGetDepartCitiesResponse(GetDepartCitiesResponse value) {
        return new JAXBElement<GetDepartCitiesResponse>(_GetDepartCitiesResponse_QNAME, GetDepartCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationCities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDestinationCities }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDestinationCities")
    public JAXBElement<GetDestinationCities> createGetDestinationCities(GetDestinationCities value) {
        return new JAXBElement<GetDestinationCities>(_GetDestinationCities_QNAME, GetDestinationCities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationCitiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDestinationCitiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDestinationCitiesResponse")
    public JAXBElement<GetDestinationCitiesResponse> createGetDestinationCitiesResponse(GetDestinationCitiesResponse value) {
        return new JAXBElement<GetDestinationCitiesResponse>(_GetDestinationCitiesResponse_QNAME, GetDestinationCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetErabiltzailearenMugimenduak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetErabiltzailearenMugimenduak }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getErabiltzailearenMugimenduak")
    public JAXBElement<GetErabiltzailearenMugimenduak> createGetErabiltzailearenMugimenduak(GetErabiltzailearenMugimenduak value) {
        return new JAXBElement<GetErabiltzailearenMugimenduak>(_GetErabiltzailearenMugimenduak_QNAME, GetErabiltzailearenMugimenduak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetErabiltzailearenMugimenduakResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetErabiltzailearenMugimenduakResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getErabiltzailearenMugimenduakResponse")
    public JAXBElement<GetErabiltzailearenMugimenduakResponse> createGetErabiltzailearenMugimenduakResponse(GetErabiltzailearenMugimenduakResponse value) {
        return new JAXBElement<GetErabiltzailearenMugimenduakResponse>(_GetErabiltzailearenMugimenduakResponse_QNAME, GetErabiltzailearenMugimenduakResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservedRidesByDriver }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservedRidesByDriver }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getReservedRidesByDriver")
    public JAXBElement<GetReservedRidesByDriver> createGetReservedRidesByDriver(GetReservedRidesByDriver value) {
        return new JAXBElement<GetReservedRidesByDriver>(_GetReservedRidesByDriver_QNAME, GetReservedRidesByDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservedRidesByDriverResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservedRidesByDriverResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getReservedRidesByDriverResponse")
    public JAXBElement<GetReservedRidesByDriverResponse> createGetReservedRidesByDriverResponse(GetReservedRidesByDriverResponse value) {
        return new JAXBElement<GetReservedRidesByDriverResponse>(_GetReservedRidesByDriverResponse_QNAME, GetReservedRidesByDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRide }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRide }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getRide")
    public JAXBElement<GetRide> createGetRide(GetRide value) {
        return new JAXBElement<GetRide>(_GetRide_QNAME, GetRide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRideResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRideResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getRideResponse")
    public JAXBElement<GetRideResponse> createGetRideResponse(GetRideResponse value) {
        return new JAXBElement<GetRideResponse>(_GetRideResponse_QNAME, GetRideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRides }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRides }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getRides")
    public JAXBElement<GetRides> createGetRides(GetRides value) {
        return new JAXBElement<GetRides>(_GetRides_QNAME, GetRides.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRidesByDriver }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRidesByDriver }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getRidesByDriver")
    public JAXBElement<GetRidesByDriver> createGetRidesByDriver(GetRidesByDriver value) {
        return new JAXBElement<GetRidesByDriver>(_GetRidesByDriver_QNAME, GetRidesByDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRidesByDriverResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRidesByDriverResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getRidesByDriverResponse")
    public JAXBElement<GetRidesByDriverResponse> createGetRidesByDriverResponse(GetRidesByDriverResponse value) {
        return new JAXBElement<GetRidesByDriverResponse>(_GetRidesByDriverResponse_QNAME, GetRidesByDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRidesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRidesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getRidesResponse")
    public JAXBElement<GetRidesResponse> createGetRidesResponse(GetRidesResponse value) {
        return new JAXBElement<GetRidesResponse>(_GetRidesResponse_QNAME, GetRidesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThisMonthDatesWithRides }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetThisMonthDatesWithRides }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getThisMonthDatesWithRides")
    public JAXBElement<GetThisMonthDatesWithRides> createGetThisMonthDatesWithRides(GetThisMonthDatesWithRides value) {
        return new JAXBElement<GetThisMonthDatesWithRides>(_GetThisMonthDatesWithRides_QNAME, GetThisMonthDatesWithRides.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThisMonthDatesWithRidesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetThisMonthDatesWithRidesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getThisMonthDatesWithRidesResponse")
    public JAXBElement<GetThisMonthDatesWithRidesResponse> createGetThisMonthDatesWithRidesResponse(GetThisMonthDatesWithRidesResponse value) {
        return new JAXBElement<GetThisMonthDatesWithRidesResponse>(_GetThisMonthDatesWithRidesResponse_QNAME, GetThisMonthDatesWithRidesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetnPlaces }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetnPlaces }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getnPlaces")
    public JAXBElement<GetnPlaces> createGetnPlaces(GetnPlaces value) {
        return new JAXBElement<GetnPlaces>(_GetnPlaces_QNAME, GetnPlaces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetnPlacesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetnPlacesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getnPlacesResponse")
    public JAXBElement<GetnPlacesResponse> createGetnPlacesResponse(GetnPlacesResponse value) {
        return new JAXBElement<GetnPlacesResponse>(_GetnPlacesResponse_QNAME, GetnPlacesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeBD }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitializeBD }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "initializeBD")
    public JAXBElement<InitializeBD> createInitializeBD(InitializeBD value) {
        return new JAXBElement<InitializeBD>(_InitializeBD_QNAME, InitializeBD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeBDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitializeBDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "initializeBDResponse")
    public JAXBElement<InitializeBDResponse> createInitializeBDResponse(InitializeBDResponse value) {
        return new JAXBElement<InitializeBDResponse>(_InitializeBDResponse_QNAME, InitializeBDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KotxeGehitu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KotxeGehitu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "kotxeGehitu")
    public JAXBElement<KotxeGehitu> createKotxeGehitu(KotxeGehitu value) {
        return new JAXBElement<KotxeGehitu>(_KotxeGehitu_QNAME, KotxeGehitu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KotxeGehituResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KotxeGehituResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "kotxeGehituResponse")
    public JAXBElement<KotxeGehituResponse> createKotxeGehituResponse(KotxeGehituResponse value) {
        return new JAXBElement<KotxeGehituResponse>(_KotxeGehituResponse_QNAME, KotxeGehituResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KotxeakEskuratu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KotxeakEskuratu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "kotxeakEskuratu")
    public JAXBElement<KotxeakEskuratu> createKotxeakEskuratu(KotxeakEskuratu value) {
        return new JAXBElement<KotxeakEskuratu>(_KotxeakEskuratu_QNAME, KotxeakEskuratu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KotxeakEskuratuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KotxeakEskuratuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "kotxeakEskuratuResponse")
    public JAXBElement<KotxeakEskuratuResponse> createKotxeakEskuratuResponse(KotxeakEskuratuResponse value) {
        return new JAXBElement<KotxeakEskuratuResponse>(_KotxeakEskuratuResponse_QNAME, KotxeakEskuratuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MezuakLortu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MezuakLortu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "mezuakLortu")
    public JAXBElement<MezuakLortu> createMezuakLortu(MezuakLortu value) {
        return new JAXBElement<MezuakLortu>(_MezuakLortu_QNAME, MezuakLortu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MezuakLortuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MezuakLortuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "mezuakLortuResponse")
    public JAXBElement<MezuakLortuResponse> createMezuakLortuResponse(MezuakLortuResponse value) {
        return new JAXBElement<MezuakLortuResponse>(_MezuakLortuResponse_QNAME, MezuakLortuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaioaHasi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaioaHasi }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "saioaHasi")
    public JAXBElement<SaioaHasi> createSaioaHasi(SaioaHasi value) {
        return new JAXBElement<SaioaHasi>(_SaioaHasi_QNAME, SaioaHasi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaioaHasiAdmin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaioaHasiAdmin }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "saioaHasiAdmin")
    public JAXBElement<SaioaHasiAdmin> createSaioaHasiAdmin(SaioaHasiAdmin value) {
        return new JAXBElement<SaioaHasiAdmin>(_SaioaHasiAdmin_QNAME, SaioaHasiAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaioaHasiAdminResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaioaHasiAdminResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "saioaHasiAdminResponse")
    public JAXBElement<SaioaHasiAdminResponse> createSaioaHasiAdminResponse(SaioaHasiAdminResponse value) {
        return new JAXBElement<SaioaHasiAdminResponse>(_SaioaHasiAdminResponse_QNAME, SaioaHasiAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaioaHasiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaioaHasiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "saioaHasiResponse")
    public JAXBElement<SaioaHasiResponse> createSaioaHasiResponse(SaioaHasiResponse value) {
        return new JAXBElement<SaioaHasiResponse>(_SaioaHasiResponse_QNAME, SaioaHasiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "jasotakoErreklamazioak", scope = Admin.class)
    @XmlIDREF
    public JAXBElement<Object> createAdminJasotakoErreklamazioak(Object value) {
        return new JAXBElement<Object>(_AdminJasotakoErreklamazioak_QNAME, Object.class, Admin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "mezuak", scope = Erreklamazioa.class)
    @XmlIDREF
    public JAXBElement<Object> createErreklamazioaMezuak(Object value) {
        return new JAXBElement<Object>(_ErreklamazioaMezuak_QNAME, Object.class, Erreklamazioa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "mugimenduak", scope = User.class)
    @XmlIDREF
    public JAXBElement<Object> createUserMugimenduak(Object value) {
        return new JAXBElement<Object>(_UserMugimenduak_QNAME, Object.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "balorazioak", scope = User.class)
    @XmlIDREF
    public JAXBElement<Object> createUserBalorazioak(Object value) {
        return new JAXBElement<Object>(_UserBalorazioak_QNAME, Object.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "erreserbak", scope = Bidaiaria.class)
    @XmlIDREF
    public JAXBElement<Object> createBidaiariaErreserbak(Object value) {
        return new JAXBElement<Object>(_BidaiariaErreserbak_QNAME, Object.class, Bidaiaria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "alertak", scope = Bidaiaria.class)
    @XmlIDREF
    public JAXBElement<Object> createBidaiariaAlertak(Object value) {
        return new JAXBElement<Object>(_BidaiariaAlertak_QNAME, Object.class, Bidaiaria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "bidalitakoErreklamazioak", scope = Bidaiaria.class)
    @XmlIDREF
    public JAXBElement<Object> createBidaiariaBidalitakoErreklamazioak(Object value) {
        return new JAXBElement<Object>(_BidaiariaBidalitakoErreklamazioak_QNAME, Object.class, Bidaiaria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "erreserbak", scope = Ride.class)
    @XmlIDREF
    public JAXBElement<Object> createRideErreserbak(Object value) {
        return new JAXBElement<Object>(_BidaiariaErreserbak_QNAME, Object.class, Ride.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rides", scope = Driver.class)
    @XmlIDREF
    public JAXBElement<Object> createDriverRides(Object value) {
        return new JAXBElement<Object>(_DriverRides_QNAME, Object.class, Driver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "kotxeak", scope = Driver.class)
    @XmlIDREF
    public JAXBElement<Object> createDriverKotxeak(Object value) {
        return new JAXBElement<Object>(_DriverKotxeak_QNAME, Object.class, Driver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "JasotakoErreklamazioak", scope = Driver.class)
    @XmlIDREF
    public JAXBElement<Object> createDriverJasotakoErreklamazioak(Object value) {
        return new JAXBElement<Object>(_DriverJasotakoErreklamazioak_QNAME, Object.class, Driver.class, value);
    }

}
