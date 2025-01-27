package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1StorageOSPersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getFsType();
    public A withFsType(java.lang.String fsType);
    public java.lang.Boolean hasFsType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original);
    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSecretRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectReference getSecretRef();
    public io.kubernetes.client.openapi.models.V1ObjectReference buildSecretRef();
    public A withSecretRef(io.kubernetes.client.openapi.models.V1ObjectReference secretRef);
    public java.lang.Boolean hasSecretRef();
    public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);
    public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);
    public java.lang.String getVolumeName();
    public A withVolumeName(java.lang.String volumeName);
    public java.lang.Boolean hasVolumeName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVolumeName instead.
     */
        public A withNewVolumeName(java.lang.String original);
    public java.lang.String getVolumeNamespace();
    public A withVolumeNamespace(java.lang.String volumeNamespace);
    public java.lang.Boolean hasVolumeNamespace();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVolumeNamespace instead.
     */
        public A withNewVolumeNamespace(java.lang.String original);
    public interface SecretRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<N>> {

            public N and();
            public N endSecretRef();    }


}
