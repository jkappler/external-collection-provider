# Liferay External Collection Provider Demo

This is a simple demo on how to create a collection provider that retrieves external data to Liferay (from an API) and then displays it in a collection display fragment.

To deploy it, you would have to specify the location of your liferay-portal source code and the bundles directory in 
gradle.properties:

liferay.workspace.home.dir=[location of bundles directory]

liferay.source.home.dir=[location of the source code]

Once deployed you will be able to select the collection provider for the collection display fragment. This code also
includes a table renderer for the data, so once selected, you can select it from the list of available renderers.

Shout out to all the amazing people that helped in developing what is included in the demo (in alphabetical order xD):
@ealonso, @guilhermedcamacho, @jorgeFerrer, @lfbesada, @p2kmgcl, @pavel-savinov, @ruben-pulido, @sandrodw3, @veroglez and @victorg1991

Also to all the designers (that sadly aren't in github).
