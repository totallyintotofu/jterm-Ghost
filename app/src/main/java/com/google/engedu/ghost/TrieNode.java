/* Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.engedu.ghost;

import java.util.HashMap;
import java.util.Iterator;

public class TrieNode {
    // A map from the next character in the alphabet to the trie node containing those words
    private HashMap<Character, TrieNode> children;
    // If true, this node represents a complete word.
    private boolean isWord;

    public TrieNode() {
        children = new HashMap<>();
        isWord = false;
    }

    /**
     * Add the string as a child of this trie node.
     *
     * @param s String representing partial suffix of a word.
     */
    public void add(String s) {
        // TODO(you): add String s to this node.
    }

    /**
     * Determine whether this node is part of a complete word for the string.
     *
     * @param s String representing partial suffix of a word.
     * @return
     */
    public boolean isWord(String s) {
        // TODO(you): determine whether this node is part of a complete word for String s.
        return false;
    }

    /**
     * Find any complete word with this partial segment.
     *
     * @param s String representing partial suffix of a word.
     * @return
     */
    public String getAnyWordStartingWith(String s) {
        // TODO(you):
        return null;
    }

    /**
     * Find a good complete word with this partial segment.
     *
     * Definition of "good" left to implementor.
     *
     * @param s String representing partial suffix of a word.
     * @return
     */
    public String getGoodWordStartingWith(String s) {
        return null;
    }
}