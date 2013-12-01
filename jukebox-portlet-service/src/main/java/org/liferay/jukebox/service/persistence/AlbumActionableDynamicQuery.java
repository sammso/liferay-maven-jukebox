package org.liferay.jukebox.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import org.liferay.jukebox.model.Album;
import org.liferay.jukebox.service.AlbumLocalServiceUtil;

/**
 * @author Julio Camarero
 * @generated
 */
public abstract class AlbumActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AlbumActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AlbumLocalServiceUtil.getService());
        setClass(Album.class);

        setClassLoader(org.liferay.jukebox.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("albumId");
    }
}
