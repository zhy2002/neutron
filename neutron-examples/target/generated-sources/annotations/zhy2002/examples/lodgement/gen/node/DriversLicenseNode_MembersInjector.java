package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.DriversLicenseNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DriversLicenseNode_MembersInjector
    implements MembersInjector<DriversLicenseNode> {
  private final Provider<DriversLicenseNodeComponent.Builder> builderProvider;

  public DriversLicenseNode_MembersInjector(
      Provider<DriversLicenseNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<DriversLicenseNode> create(
      Provider<DriversLicenseNodeComponent.Builder> builderProvider) {
    return new DriversLicenseNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(DriversLicenseNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      DriversLicenseNode instance, Provider<DriversLicenseNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
