/*
 * Copyright (C) 2004-2014 L2J DataPack
 * 
 * This file is part of L2J DataPack.
 * 
 * L2J DataPack is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * L2J DataPack is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package YANModPack.YANEventEngine.java.model.tvt;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import YANModPack.YANEventEngine.java.model.EventSpawnpoint;

/**
 * @author FBIagent
 */
public final class TvtEventTeamSpawnpoints
{
	@XmlElementWrapper(name = "red", nillable = true)
	@XmlElement(name = "spawnpoint", required = true)
	private EventSpawnpoint[] _redSpawnpoints;
	@XmlElementWrapper(name = "blue", nillable = true)
	@XmlElement(name = "spawnpoint", required = true)
	private EventSpawnpoint[] _blueSpawnpoints;
	
	public EventSpawnpoint[] getRedSpawnpoints()
	{
		return _redSpawnpoints;
	}
	
	public EventSpawnpoint[] getBlueSpawnpoints()
	{
		return _blueSpawnpoints;
	}
}
