package powermoves.com.gasmoney.networking;

import java.util.List;

import powermoves.com.gasmoney.models.NearByGasStationModel;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by aleckson on 8/15/2016.
 * Defines the endpoints to be used
 */

public interface GasFeedAPI {

    /**
     *Retrieves distance in miles radius of near by gas stations
     * according to a user's geo location.
     */
    @GET("stations/")
    Observable<List<NearByGasStationModel>> NearByGasStations();
}
