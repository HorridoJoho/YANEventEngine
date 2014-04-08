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

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import YANModPack.YANEventEngine.java.model.Event;

/**
 * @author FBIagent
 */
public final class TvtEvent extends Event
{
	@XmlAttribute(name = "min_team_players", required = true)
	private int _minTeamPlayers;
	@XmlAttribute(name = "max_team_players", required = true)
	private int _maxTeamPlayers;
	@XmlAttribute(name = "red_team_name", required = true)
	private String _redTeamName;
	@XmlAttribute(name = "blue_team_name", required = true)
	private String _blueTeamName;
	
	@XmlElement(name = "preparation", required = true)
	private TvtEventPreparation _preparation;
	@XmlElementWrapper(name = "rounds", required = true)
	@XmlElement(name = "round", required = true)
	private TvtEventRound[] _rounds;
	
	public int getMinTeamPlayers()
	{
		return _minTeamPlayers;
	}
	
	public int getMaxTeamPlayers()
	{
		return _maxTeamPlayers;
	}
	
	public TvtEventPreparation getPreparation()
	{
		return _preparation;
	}
	
	public TvtEventRound[] getRounds()
	{
		return _rounds;
	}
}
