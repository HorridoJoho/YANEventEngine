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
package YANModPack.YANEventEngine.java.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author FBIagent
 */
public final class EventModeParameter
{
	@XmlAttribute(name = "name", required = true)
	private String _name;
	@XmlAttribute(name = "value", required = true)
	private String _value;
	
	public String getName()
	{
		return _name;
	}
	
	public String getValue()
	{
		return _value;
	}
}
