package jk.codespace.solutions.recursion;

import java.util.Objects;

/*
    Simple class representing a Repeater

    Using immutable attributes but with public accessibility to avoid boilerplate getter and setter methods
    */
public class Repeater {

    public final String identifier;
    public final Integer downstreamChannel;
    public final Integer upstreamChannel;

    public Repeater(final String identifier, final Integer downstreamChannel, final Integer upstreamChannel){
        this.identifier = identifier;
        this.downstreamChannel = downstreamChannel;
        this.upstreamChannel = upstreamChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repeater repeater = (Repeater) o;
        return Objects.equals(identifier, repeater.identifier) &&
                Objects.equals(downstreamChannel, repeater.downstreamChannel) &&
                Objects.equals(upstreamChannel, repeater.upstreamChannel);
    }


    @Override
    public int hashCode() {
        return Objects.hash(identifier, downstreamChannel, upstreamChannel);
    }

    @Override
    public String toString() {
        return "Repeater{" +
                "identifier='" + identifier + '\'' +
                ", downstreamChannel=" + downstreamChannel +
                ", upstreamChannel=" + upstreamChannel +
                '}';
    }
}
