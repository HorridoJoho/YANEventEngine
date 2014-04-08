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
package YANModPack.YANEventEngine.java.model.ava;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import YANModPack.YANEventEngine.java.model.Event;

/**
 * @author FBIagent
 */
public final class AvaEvent extends Event
{
	@XmlAttribute(name = "min_players", required = true)
	private int _minPlayers;
	@XmlAttribute(name = "max_players", required = true)
	private int _maxPlayers;
	
	@XmlElement(name = "preparation", required = true)
	private AvaEventPreparation _preparation;
	@XmlElementWrapper(name = "rounds", required = true)
	@XmlElement(name = "round", required = true)
	private AvaEventRound[] _rounds;
	
	public int getMinPlayers()
	{
		return _minPlayers;
	}
	
	public int getMaxPlayers()
	{
		return _maxPlayers;
	}
	
	public AvaEventPreparation getPreparation()
	{
		return _preparation;
	}
	
	public AvaEventRound[] getRounds()
	{
		return _rounds;
	}
}
