package net.sourceforge.ondex.parser2;

import net.sourceforge.ondex.core.ONDEXGraph;

/**
 * TODO: comment me!
 *
 * @author brandizi
 * <dl><dt>Date:</dt><dd>24 Jul 2017</dd></dl>
 *
 */
public class IdentityMapper<S> implements Mapper<S, S>
{
	@Override
	public S map ( S source, ONDEXGraph graph )
	{
		return source;
	}
}
