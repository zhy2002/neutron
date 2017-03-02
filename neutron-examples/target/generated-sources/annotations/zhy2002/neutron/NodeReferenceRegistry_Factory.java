package zhy2002.neutron;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NodeReferenceRegistry_Factory implements Factory<NodeReferenceRegistry> {
  private static final NodeReferenceRegistry_Factory INSTANCE = new NodeReferenceRegistry_Factory();

  @Override
  public NodeReferenceRegistry get() {
    return new NodeReferenceRegistry();
  }

  public static Factory<NodeReferenceRegistry> create() {
    return INSTANCE;
  }
}
