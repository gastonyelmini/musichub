package digitalhouse.android.Model.DAO.DAOInternet;

import digitalhouse.android.Helpers.DeezerHelper;
import digitalhouse.android.Helpers.InternetAsync;
import digitalhouse.android.Model.POJO.GenreContainer;
import digitalhouse.android.Util.ResultListener;

/**
 * Created by fedet on 13/6/2017.
 */

public class DAOGenreInternet {

    public void obtenerSong (ResultListener<GenreContainer> listener){
        InternetAsync<GenreContainer> taskGenre = new InternetAsync(listener, GenreContainer.class);
        String url = DeezerHelper.listaDeGeneros();
        taskGenre.execute(url);
    }
}
