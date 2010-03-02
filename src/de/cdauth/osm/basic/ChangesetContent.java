/*
    This file is part of the osmrmhv library.

    osmrmhv is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    osmrmhv is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with osmrmhv. If not, see <http://www.gnu.org/licenses/>.
*/

package de.cdauth.osm.basic;

import java.util.Map;

public interface ChangesetContent
{
	/**
	 * An osmChange file knows these types of changes.
	 */
	public enum ChangeType { create, modify, delete };

	public Changeset getChangeset();
	
	public VersionedObject[] getMemberObjects() throws APIError;
	
	public VersionedObject[] getMemberObjects(ChangeType a_type) throws APIError;
	
	public Map<VersionedObject,VersionedObject> getPreviousVersions(boolean a_onlyWithTagChanges) throws APIError;
}
