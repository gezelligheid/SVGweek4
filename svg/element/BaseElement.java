package svg.element;
import java.util.*;
import svg.element.Element;

//-----------------------------------------------------------------------------

/**
 * Base SVG element type.
 * @author cambolbro
 */
public abstract class BaseElement implements Element
{
	private static ArrayList<Element> elementRegistry = new ArrayList<Element>();
	private final String label;

	// Character position in SVG file
	private int filePos;
	
	//-------------------------------------------------------------------------
	
	public BaseElement(final String label)
	{
		this.label = new String(label);
	}
	
	//-------------------------------------------------------------------------

	@Override
	public String label()
	{
		return label;
	}
	
	@Override
	public int compare(final Element other)
	{
		return filePos - ((BaseElement)other).filePos;
	}

	//-------------------------------------------------------------------------

	public int filePos()
	{
		return filePos;
	}
	
	public void setFilePos(final int pos)
	{
		filePos = pos;
	}

	public static void updateRegistry(Element e) {
		elementRegistry.add(e);

	}

	//-------------------------------------------------------------------------

}
