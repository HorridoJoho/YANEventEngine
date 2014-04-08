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

import java.util.GregorianCalendar;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author FBIagent
 */
public abstract class Event
{
	@XmlAttribute(name = "name", required = true)
	private String _name;
	@XmlAttribute(name = "start_date")
	private XMLGregorianCalendar _startDate;
	@XmlAttribute(name = "end_date")
	private XMLGregorianCalendar _endDate;
	@XmlAttribute(name = "participation_minutes", required = true)
	private int _participationMinutes;
	@XmlAttribute(name = "preparation_seconds", required = true)
	private int _preparationSeconds;
	
	public String getName()
	{
		return _name;
	}
	
	public GregorianCalendar getStartDate()
	{
		return _startDate.toGregorianCalendar();
	}
	
	public GregorianCalendar getEndDate()
	{
		return _endDate.toGregorianCalendar();
	}
	
	public int getParticipationMinutes()
	{
		return _participationMinutes;
	}
	
	public int getPreparationSeconds()
	{
		return _preparationSeconds;
	}
}
