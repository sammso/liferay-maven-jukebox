package org.liferay.jukebox.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Song service. Represents a row in the &quot;jukebox_Song&quot; database table, with each column mapped to a property of this class.
 *
 * @author Julio Camarero
 * @see SongModel
 * @see org.liferay.jukebox.model.impl.SongImpl
 * @see org.liferay.jukebox.model.impl.SongModelImpl
 * @generated
 */
public interface Song extends SongModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link org.liferay.jukebox.model.impl.SongImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.lang.String getImageURL(
        com.liferay.portal.theme.ThemeDisplay themeDisplay)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getLyricsURL(
        com.liferay.portal.theme.ThemeDisplay themeDisplay)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getSongURL(
        com.liferay.portal.theme.ThemeDisplay themeDisplay,
        java.lang.String audioContainer)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
