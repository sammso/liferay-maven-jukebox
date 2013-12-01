package org.liferay.jukebox.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Album service. Represents a row in the &quot;jukebox_Album&quot; database table, with each column mapped to a property of this class.
 *
 * @author Julio Camarero
 * @see AlbumModel
 * @see org.liferay.jukebox.model.impl.AlbumImpl
 * @see org.liferay.jukebox.model.impl.AlbumModelImpl
 * @generated
 */
public interface Album extends AlbumModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link org.liferay.jukebox.model.impl.AlbumImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.kernel.repository.model.FileEntry getCustomImage()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getImageURL(
        com.liferay.portal.theme.ThemeDisplay themeDisplay)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public boolean hasCustomImage()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
