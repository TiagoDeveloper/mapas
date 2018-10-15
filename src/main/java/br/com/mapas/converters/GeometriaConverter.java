package br.com.mapas.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;

@Converter
public class GeometriaConverter implements AttributeConverter<String, Point>{

	@Override
	public Point convertToDatabaseColumn(String point) {
		try {
			
			Point geometry = (Point) new WKTReader().read(point);
			
			return geometry;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String convertToEntityAttribute(Point point) {
		return point.toText();
	}


}
