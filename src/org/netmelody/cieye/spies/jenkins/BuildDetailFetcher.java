package org.netmelody.cieye.spies.jenkins;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.netmelody.cieye.spies.jenkins.jsondomain.BuildDetail;

import com.google.common.base.Function;
import com.google.common.collect.MapMaker;

public final class BuildDetailFetcher {

    private final Map<String, BuildDetail> buildDetails;
    
    public BuildDetailFetcher(final JenkinsCommunicator communicator) {
        buildDetails =
            new MapMaker()
                 .expireAfterWrite(2, TimeUnit.SECONDS)
                 .makeComputingMap(new Function<String, BuildDetail>() {
                                       public BuildDetail apply(String buildUrl) {
                                           return communicator.buildDetailsFor(buildUrl);
                                       }
                                   });
    }
    
    public BuildDetail detailsOf(String buildUrl) {
        return buildDetails.get(buildUrl);
    }
}
