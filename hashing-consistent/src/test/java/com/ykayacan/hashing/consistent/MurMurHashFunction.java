/*
 * Copyright 2019 Yasin Sinan Kayacan
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

package com.ykayacan.hashing.consistent;

import com.ykayacan.hashing.consistent.util.MurmurHash;
import com.ykayacan.hashing.api.HashFunction;

final class MurMurHashFunction implements HashFunction {

  private MurMurHashFunction() {}

  static HashFunction create() {
    return new MurMurHashFunction();
  }

  @Override
  public long hash(String key) {
    return MurmurHash.hash64(key);
  }
}