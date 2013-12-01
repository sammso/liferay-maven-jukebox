package org.liferay.jukebox.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import org.liferay.jukebox.service.AlbumLocalServiceUtil;
import org.liferay.jukebox.service.AlbumServiceUtil;
import org.liferay.jukebox.service.ArtistLocalServiceUtil;
import org.liferay.jukebox.service.ArtistServiceUtil;
import org.liferay.jukebox.service.ClpSerializer;
import org.liferay.jukebox.service.SongLocalServiceUtil;
import org.liferay.jukebox.service.SongServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AlbumLocalServiceUtil.clearService();

            AlbumServiceUtil.clearService();
            ArtistLocalServiceUtil.clearService();

            ArtistServiceUtil.clearService();
            SongLocalServiceUtil.clearService();

            SongServiceUtil.clearService();
        }
    }
}
