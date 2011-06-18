package org.netmelody.cieye.server.configuration.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.netmelody.cieye.core.domain.Sponsor;
import org.netmelody.cieye.server.configuration.RecordedKnownOffenders;
import org.netmelody.cieye.server.configuration.SettingsFile;


public final class RecordedKnownOffendersTest {

    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder();
    private RecordedKnownOffenders offenders;
    

    @Before
    public void createOffendersFile() throws IOException {
        final File peeps = testFolder.newFile("peeps.txt");
        FileUtils.copyInputStreamToFile(RecordedKnownOffenders.class.getResourceAsStream("templates/pictures.txt.template"),
                                        peeps);
        offenders = new RecordedKnownOffenders(new SettingsFile(peeps));
    }
    
    @Test public void
    looksUpSimpleOffenderStrings() {
        assertThat(offenders.search("vlad"), contains(new Sponsor("", "/pictures/vlad.png")));
    }
    
}