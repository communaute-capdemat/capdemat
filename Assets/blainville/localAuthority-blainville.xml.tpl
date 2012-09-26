<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN//EN" "http://www.springframework.org/dtd/spring-beans.dtd">

<beans>

  <bean id="configurationBean_blainville"
    class="fr.cg95.cvq.service.authority.LocalAuthorityConfigurationBean"
    init-method="init">
    <property name="name" value="blainville"/>
    <property name="defaultServerName" value="localhost"/>
    <property name="defaultEmail" value="sansmail@blainville.fr"/>
    <property name="autotransition" value="true"/>
    <property name="jpaConfigurations">
        <props>
            <prop key="hibernate.show_sql">false</prop>
            <prop key="hibernate.format_sql">false</prop>
            <prop key="hibernate.connection.driver_class">org.postgresql.Driver</prop>
            <prop key="hibernate.connection.url">jdbc:postgresql://localhost:5432/capdemat_blainville_${branch}</prop>
            <prop key="hibernate.connection.username">capdemat</prop>
            <prop key="hibernate.connection.password">capdematpass</prop>
            <prop key="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</prop>
            <prop key="acquireIncrement">3</prop>
            <prop key="initialPoolSize">0</prop>
            <prop key="minPoolSize">0</prop>
            <prop key="maxStatements">24</prop>
            <prop key="maxIdleTime">300</prop>
        </props>
    </property>
    <property name="paymentServices">
      <map>
         <entry>
          <key>
            <ref bean="fakePaymentProviderService" />
          </key>
          <bean class="fr.cg95.cvq.service.payment.PaymentServiceBean">
            <property name="broker" value="Régie démo de Blainville"></property>
            <property name="friendlyLabel" value="Services autres que restauration scolaire"></property>
            <property name="requestTypes">
              <list>
                <value>Ticket Booking</value>
              </list>
            </property>
          </bean>
        </entry>

<!--        <entry>
          <key>
            <ref bean="tipiPaymentProvider" />
          </key>
          <bean class="fr.cg95.cvq.service.payment.PaymentServiceBean">
            <property name="broker" value="Tipi"></property>
            <property name="requestTypes">
              <list>
                <value>Perischool Activity Registration</value>
              </list>
            </property>
            <property name="serviceProperties">
              <map>
                <entry>
                  <key><value>numcli</value></key>
                  <value>001340</value>
                </entry>
                <entry>
                  <key><value>saisie</value></key>
                  <value>T</value>
                </entry>
              </map>
            </property>
          </bean>
        </entry> -->
      </map>
    </property>
    <property name="externalServices">
      <map>
        <entry>
          <key>
            <ref bean="fakeExternalService" />
		  </key>
          <bean class="fr.cg95.cvq.external.ExternalServiceBean">
            <property name="requestTypes">
              <list>
                <value>Perischool Activity Registration</value>
                <value>Birth Details</value>
                <value>Death Details</value>
                <value>Marriage Details</value>
                <value>Iconito Ps Subscription</value>
                <value>Electoral Roll Registration</value>
              </list>
            </property>
            <property name="password">
              <value>blainvillepwd</value>
            </property>
            <property name="serviceProperties">
              <map>
                <entry>
                  <key><value>baseUrl</value></key>
                  <value></value>
                </entry>
              </map>
            </property>
          </bean>
        </entry>
        <!--<entry>
          <key>
            <ref bean="iconitoPeriscolaireExternalService" />
          </key>
          <bean class="fr.cg95.cvq.external.ExternalServiceBean">
            <property name="requestTypes">
              <list>
                <value>Perischool Activity Registration</value>
                <value>Birth Details</value>
                <value>Death Details</value>
                <value>Marriage Details</value>
                <value>Iconito Ps Subscription</value>
                <value>Electoral Roll Registration</value>
              </list>
            </property>
            <property name="password">
              <value>blainvillepwd</value>
            </property>
            <property name="serviceProperties">
              <map>
                <entry>
                  <key><value>baseUrl</value></key>
                  <value></value>
                </entry>
              </map>
            </property>
          </bean>
        </entry>
        <entry>-->
        <!--<entry>
          <key>
            <ref bean="horanetExternalService" />
          </key>
          <bean class="fr.cg95.cvq.external.ExternalServiceBean">
            <property name="requestTypes">
              <list>
                <value>School Canteen Registration</value>
                <value>Perischool Activity Registration</value>
                <value>Recreation Activity Registration</value>
                <value>School Transport Registration</value>
                <value>Global School Registration</value>
                <value>Leisure Center Registration</value>
                <value>Holiday Camp Registration</value>
                <value>Ecole De Musique</value>
                <value>Activity Registration</value>
              </list>
            </property>
            <property name="serviceProperties">
              <map>
                <entry>
                  <key><value>businessInformationProvider</value></key>
                  <value>true</value>
                  <key><value>endPoint</value></key>
                  <value>http://80.118.178.14/WebServiceCG95/CVQ.asmx</value>
                </entry>
                <entry>
                  <key><value>endPoint2</value></key>
                  <value>http://80.118.178.14/WebServiceCG95/CVQ2.asmx</value>
                </entry>
                <entry>
                  <key><value>endPoint3</value></key>
                  <value>http://80.118.178.14/WS-WebCT/CVQ3.asmx</value>
                </entry>
                <entry>
                  <key><value>login</value></key>
                  <value>test</value>
                </entry>
                <entry>
                  <key><value>password</value></key>
                  <value>test</value>
                </entry>
                <entry>
                  <key><value>sendHomeFolderCreation</value></key>
                  <value>true</value>
                </entry>
                <entry>
                  <key>
                    <value>RequestCanGetRedirectUrl</value>
                  </key>
                    <list>
                      <value>Ecole De Musique</value>
                    </list>
                </entry>
              </map>
            </property>
          </bean>
        </entry>-->
        <entry>
          <key>
            <ref bean="fakePointExternalService" />
          </key>
          <bean class="fr.cg95.cvq.external.ExternalServiceBean">
            <property name="requestTypes">
              <list>
                <value>Technical Intervention</value>
                <value>School Canteen Registration</value>
              </list>
            </property>
           <property name="password" value="abcd"/>
          </bean>
        </entry>
        <entry>
          <key>
            <ref bean="restExternalService" />
          </key>
          <bean class="fr.cg95.cvq.external.ExternalServiceBean">
            <property name="requestTypes">
              <list>
                <value>Compostable Waste Collection</value>
              </list>
            </property>
           <property name="login" value="BlainVilleRest"/>
           <property name="password" value="abcd"/>
          </bean>
        </entry>
        <entry>
          <key>
            <ref bean="externalApplicationProviderService" />
          </key>
          <bean class="fr.cg95.cvq.external.ExternalServiceBean">
            <property name="requestTypes">
              <list>
                <value>School Canteen Registration</value>
                <value>Perischool Activity Registration</value>
                <value>Recreation Activity Registration</value>
              </list>
            </property>
          </bean>
        </entry>
        <!--entry>
          <key>
            <ref bean="mailGenericExternalService" />
          </key>
          <bean class="fr.cg95.cvq.external.ExternalServiceBean">
            <property name="requestTypes">
              <list>
                <value>Finistere Apprenticeship Grant</value>
              </list>
            </property>
          </bean>
        </entry-->
      </map>
    </property>
     <property name="agentNotifications">
      <map>
        <entry>
          <key><value>NotCommitPaymentAlert</value></key>
          <map>
            <entry key="mailSendTo" value="capdemat-dev@zenexity.fr"/>
            <entry key="mailSubject" value="[CapDémat] Alerte Paiement"/>
            <entry key="mailData" value="NotCommitedPaymentsAlert"/>
          </map>
        </entry>
      </map>
    </property>
    <property name="paymentNotifications">
      <map>
        <entry>
          <key><value>CommitPaymentConfirmation</value></key>
          <map>
            <entry key="mailSubject" value="[CapDémat] Confirmation de paiement"/>
            <entry key="mailData" value="CommitPaymentNotification"/>
          </map>
        </entry>
      </map>
    </property>
    <!--
    <property name="externalApplicationProperties">
      <map>
        <entry key="booker.url" value="http://booker:9001/blainville/"/>
        <entry key="booker.logouturl" value="http://booker:9001/logout"/>
      </map>
    </property>
    -->
  </bean>

</beans>
