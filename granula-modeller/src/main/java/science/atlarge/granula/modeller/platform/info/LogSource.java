/*
 * Copyright 2015 - 2017 Atlarge Research Team,
 * operating at Technische Universiteit Delft
 * and Vrije Universiteit Amsterdam, the Netherlands.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package science.atlarge.granula.modeller.platform.info;

import science.atlarge.granula.modeller.source.log.Log;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by wing on 26-2-15.
 */
@XmlRootElement(name="Source")
public class LogSource extends Source {

    String location;

    public LogSource() {
        this.name = "unspecified";
        this.type = "LogSource";
        location = "unspecified";
    }

    public LogSource(String name, Log log) {
        this.name = name;
        this.type = "LogSource";
        this.location = log.getLocation().getLocation();
    }

    @XmlAttribute
    public String getLocation() {
        return location;
    }

}