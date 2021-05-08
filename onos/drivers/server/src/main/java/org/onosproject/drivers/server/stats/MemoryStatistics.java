/*
 * Copyright 2020-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.drivers.server.stats;

/**
 * Main memory statistics API.
 */
public interface MemoryStatistics {

    /**
     * Returns the unit of main memory statistics.
     *
     * @return main memory statistics' unit
     */
    MonitoringUnit unit();

    /**
     * Returns the amount of main memory being used.
     *
     * @return used main memory
     */
    long used();

    /**
     * Returns the amount of main memory being free.
     *
     * @return free main memory
     */
    long free();

    /**
     * Returns the total amount of main memory.
     *
     * @return total main memory
     */
    long total();

}
