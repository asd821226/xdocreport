package fr.opensagres.xdocreport.remoting.resources.services.rest.server;

import java.util.List;

import fr.opensagres.xdocreport.remoting.resources.domain.Filter;
import fr.opensagres.xdocreport.remoting.resources.domain.Resource;
import fr.opensagres.xdocreport.remoting.resources.services.DelegateResourcesService;
import fr.opensagres.xdocreport.remoting.resources.services.rest.JAXRSResourcesService;

public abstract class JAXRSResourcesServiceImpl
    extends DelegateResourcesService
    implements JAXRSResourcesService
{

    @Override
    public String getName()
    {
        return super.getName();
    }

    @Override
    public Resource getRoot()
    {
        return super.getRoot();
    }

    @Override
    public Resource getRoot( Filter filter )
    {
        return super.getRoot( filter );
    }

    @Override
    public byte[] download( String resourcePath )
    {
        return super.download( resourcePath );
    }

    @Override
    public List<byte[]> download( List<String> resourcePaths )
    {
        return super.download( resourcePaths );
    }

    @Override
    public void upload( String resourcePath, byte[] content )
    {
        super.upload( resourcePath, content );
    }

}