package org.netmelody.cieye.spies.jenkins;

import java.text.SimpleDateFormat;

import org.netmelody.cieye.core.domain.Feature;
import org.netmelody.cieye.core.observation.CiSpy;
import org.netmelody.cieye.core.observation.CodeBook;
import org.netmelody.cieye.core.observation.CommunicationNetwork;
import org.netmelody.cieye.core.observation.Contact;
import org.netmelody.cieye.core.observation.KnownOffendersDirectory;
import org.netmelody.cieye.core.observation.ObservationAgency;

public final class JenkinsObservationAgency implements ObservationAgency {

    @Override
    public CiSpy provideSpyFor(Feature feature, CommunicationNetwork network, KnownOffendersDirectory directory) {
        final Contact contact = network.makeContact(new CodeBook(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")));
        return new JenkinsSpy(feature.endpoint(), directory, contact);
    }
}