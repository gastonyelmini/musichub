package digitalhouse.android.Model.DAO.DAOInternet;

import digitalhouse.android.Helpers.DeezerHelper;
import digitalhouse.android.Helpers.InternetAsync;
import digitalhouse.android.Model.POJO.AlbumContainer;
import digitalhouse.android.Util.ResultListener;

/**
 * Created by gaston on 23/06/17.
 */

public class DAOAlbumInternet {

    public void getAlbumList (ResultListener<AlbumContainer> listener, Integer id){
        InternetAsync<AlbumContainer> taskAlbum = new InternetAsync(listener, AlbumContainer.class);
        String url = DeezerHelper.chartAlbumsPorGenero(id);
        taskAlbum.execute(url);
    }

}
