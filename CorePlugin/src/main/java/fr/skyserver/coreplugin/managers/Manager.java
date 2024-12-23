package fr.skyserver.coreplugin.managers;

import fr.skyserver.coreplugin.CorePlugin;
import lombok.Data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Data
public abstract class Manager<T> {

    final CorePlugin corePlugin;
    protected final Map<String, T> entities = new HashMap<>();

    protected Manager(CorePlugin plugin) {
        this.corePlugin = plugin;
        this.load();
        this.registerListeners();
    }

    public void add(T entity) {
        String id = getId(entity);
        this.getEntities().put(id, entity);
    }

    public void remove(UUID id) {
        this.getEntities().remove(id);
    }

    public T get(String id) {
        return this.getEntities().get(id);
    }

    public Collection<T> getAll() {
        return this.getEntities().values();
    }

    public void clear() {
        this.getEntities().clear();
    }

    public boolean contains(String id) {
        return this.getEntities().containsKey(id);
    }

    public abstract String getId(T entity);
    public abstract void load();
    public abstract void save();
    public abstract void registerListeners();
}
