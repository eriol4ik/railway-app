package com.rwapp.rwcore.database_management;

public abstract class Entity {
    private long id;

    protected Entity() {
    }

    public long getId() {
        return id;
    }

    void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Entity other = (Entity) obj;

        return id != 0L && other.id != 0L && id == other.id;
    }

    @Override
    public int hashCode() {
        if (id == 0L) {
            return super.hashCode();
        }

        int hash = 17;
        hash += this.getClass().hashCode();
        hash += Long.hashCode(id);

        return hash;
    }
}
