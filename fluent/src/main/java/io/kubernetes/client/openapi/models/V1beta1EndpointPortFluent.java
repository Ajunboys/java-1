package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1EndpointPortFluent<A extends io.kubernetes.client.openapi.models.V1beta1EndpointPortFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getAppProtocol();
    public A withAppProtocol(java.lang.String appProtocol);
    public java.lang.Boolean hasAppProtocol();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withAppProtocol instead.
     */
        public A withNewAppProtocol(java.lang.String original);
    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    public java.lang.Integer getPort();
    public A withPort(java.lang.Integer port);
    public java.lang.Boolean hasPort();
    public java.lang.String getProtocol();
    public A withProtocol(java.lang.String protocol);
    public java.lang.Boolean hasProtocol();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withProtocol instead.
     */
        public A withNewProtocol(java.lang.String original);
}
