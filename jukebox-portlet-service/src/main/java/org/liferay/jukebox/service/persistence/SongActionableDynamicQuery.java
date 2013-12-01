package org.liferay.jukebox.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import org.liferay.jukebox.model.Song;
import org.liferay.jukebox.service.SongLocalServiceUtil;

/**
 * @author Julio Camarero
 * @generated
 */
public abstract class SongActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SongActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SongLocalServiceUtil.getService());
        setClass(Song.class);

        setClassLoader(org.liferay.jukebox.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("songId");
    }
}
