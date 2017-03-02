package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PropertyTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyTypeNode_MembersInjector implements MembersInjector<PropertyTypeNode> {
  private final Provider<PropertyTypeNodeComponent.Builder> builderProvider;

  public PropertyTypeNode_MembersInjector(
      Provider<PropertyTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PropertyTypeNode> create(
      Provider<PropertyTypeNodeComponent.Builder> builderProvider) {
    return new PropertyTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PropertyTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PropertyTypeNode instance, Provider<PropertyTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
