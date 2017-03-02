package zhy2002.examples.app.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LodgementNodeChildProvider_MembersInjector
    implements MembersInjector<LodgementNodeChildProvider> {
  private final MembersInjector<AppManagerNode> appManagerNodeInjectorMembersInjector;

  public LodgementNodeChildProvider_MembersInjector(
      MembersInjector<AppManagerNode> appManagerNodeInjectorMembersInjector) {
    assert appManagerNodeInjectorMembersInjector != null;
    this.appManagerNodeInjectorMembersInjector = appManagerNodeInjectorMembersInjector;
  }

  public static MembersInjector<LodgementNodeChildProvider> create(
      MembersInjector<AppManagerNode> appManagerNodeInjectorMembersInjector) {
    return new LodgementNodeChildProvider_MembersInjector(appManagerNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(LodgementNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.appManagerNodeInjector = appManagerNodeInjectorMembersInjector;
  }

  public static void injectAppManagerNodeInjector(
      LodgementNodeChildProvider instance, MembersInjector<AppManagerNode> appManagerNodeInjector) {
    instance.appManagerNodeInjector = appManagerNodeInjector;
  }
}
