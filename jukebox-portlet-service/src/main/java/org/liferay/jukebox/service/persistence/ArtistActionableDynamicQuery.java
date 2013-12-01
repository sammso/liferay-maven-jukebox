package org.liferay.jukebox.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import org.liferay.jukebox.model.Artist;
import org.liferay.jukebox.service.ArtistLocalServiceUtil;

/**
 * @author Julio Camarero
 * @generated
 */
public abstract class ArtistActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ArtistActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ArtistLocalServiceUtil.getService());
        setClass(Artist.class);

        setClassLoader(org.liferay.jukebox.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("artistId");
    }
}
