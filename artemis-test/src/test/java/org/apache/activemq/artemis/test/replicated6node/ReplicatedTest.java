/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.artemis.test.replicated6node;

import org.apache.activemq.artemis.test.base.ReplicatedTestBase;
import org.apache.activemq.artemis.test.categories.Replicated6Node;
import org.junit.experimental.categories.Category;


@Category(Replicated6Node.class)
public class ReplicatedTest extends ReplicatedTestBase {
/*
   @Test
   public void simpleKill() throws Exception {
      String live1 = controller.getCoreConnectUrl("live1");
      live1 += "?ha=true&retryInterval=1000&retryIntervalMultiplier=1.0&reconnectAttempts=-1";
      try (ServerLocatorInternal locator = (ServerLocatorInternal) ActiveMQClient.createServerLocator(live1)) {
         locator.setCallTimeout(120000).setCallFailoverTimeout(120000);
         ClientSessionFactoryInternal sessionFactory = (ClientSessionFactoryInternal) locator.createSessionFactory();
         ClientSession session = sessionFactory.createSession();
         ClientProducer producer = session.createProducer("replicatedQueue");
         for (int i = 0; i < 100; i++) {
            ClientMessage message = session.createMessage(true);
            producer.send(message);
         }
         controller.kill("live1");
         ClientConsumer consumer = session.createConsumer("replicatedQueue");
         session.start();
         for (int i = 0; i < 100; i++) {
            ClientMessage message = consumer.receive(60000);
            Assert.assertNotNull(message);
         }
      }
   }

   @Override
   public String getLiveBrokerConfig() {
      return "/replicated/broker.xml";
   }

   @Override
   public String getBackupBrokerConfig() {
      return "/replicated/broker.xml";
   }*/
}
